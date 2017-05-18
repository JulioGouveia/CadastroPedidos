package br.com.projetoloja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.projetoloja.dao.PedidoDao;
import br.com.projetoloja.modelo.Pedido;

@Controller
public class HomeController {

	@Autowired
	private PedidoDao dao;

	@RequestMapping("/")
	public ModelAndView lista() {
		ModelAndView modelAndView = new ModelAndView("home");
		List<Pedido> pedidos = dao.lista();
		modelAndView.addObject("pedidos", pedidos);

		return modelAndView;
	}

}