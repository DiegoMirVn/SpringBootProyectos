package com.curso.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Pedido;

import com.curso.service.ServicePedido;

@RestController
public class ControllerPedido {
	@Autowired
	ServicePedido service;

	@Autowired
	RestTemplate template;

	@PostMapping(value = "/pedidos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaPedido(@RequestBody Pedido pedido) {

		service.altaPedido(pedido);

	}

	@GetMapping(value = "/pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> listarPedidos() {

		return service.listarPedidos();
	}

	@DeleteMapping(value = "/pedidos/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void borrarPedido(@PathVariable("codigo") int codigoPedido) {

		service.borrarPedido(codigoPedido);
	}
}
