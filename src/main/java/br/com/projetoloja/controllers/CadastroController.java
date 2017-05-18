package br.com.projetoloja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.projetoloja.dao.PedidoDao;
import br.com.projetoloja.modelo.Pedido;

@Controller
public class CadastroController {

	@Autowired
	private PedidoDao dao;

	@RequestMapping("/form")
	public String formCadastro() {
		return "cadastrar";
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrar(Pedido pedido) {
		System.out.println(pedido);
		dao.cadastra(pedido);
		
		return "cadastrar";
	}
}
