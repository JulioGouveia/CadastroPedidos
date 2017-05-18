package br.com.projetoloja.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import br.com.projetoloja.dao.PedidoDao;
import br.com.projetoloja.modelo.Pedido;

@RestController
public class ServicesController {

	@Autowired
	private PedidoDao dao;

	@PostMapping(value = "/cadastro")
	public ResponseEntity<??????> cadastra(@RequestBody Pedido pedido){
		dao.cadastra(pedido);
	return ResponseEntity<?????>(?????, HttpStatus.CREATED);
	 }

	@RequestMapping(value = "/lista", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Pedido> listaService() {
		List<Pedido> pedidos = dao.lista();
		return pedidos;
	}

	@RequestMapping(value = "/pedido/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Pedido numeroPedidoService(@PathVariable("id") Integer numeroPedido) {
		Pedido busca = dao.busca(numeroPedido);
		return busca;
	}

	@RequestMapping(value = "/cliente/{cod}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Pedido> dataService(@PathVariable("cod") Integer codCliente) {
		return dao.buscaCliente(codCliente);
	}

}
