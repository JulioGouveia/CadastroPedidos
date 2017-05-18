package br.com.projetoloja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetoloja.modelo.Pedido;

@Repository
@Transactional
public class PedidoDao {

	@PersistenceContext
	private EntityManager manager;

	public void cadastra(Pedido pedido) {
		manager.persist(pedido);
	}

	public List<Pedido> lista() {
		return manager.createQuery("from Pedido", Pedido.class).getResultList();
	}

	public Pedido busca(Integer numeroPedido) {
		return manager.createQuery("from Pedido where numeroPedido = :nPedido", Pedido.class)
				.setParameter("nPedido", numeroPedido).getSingleResult();
	}

	public List<Pedido> buscaCliente(Integer codCliente) {

		return manager.createQuery("from Pedido where codCliente = :codCliente", Pedido.class)
				.setParameter("codCliente", codCliente).getResultList();
	}

}
