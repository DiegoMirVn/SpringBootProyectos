package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;

import com.curso.service.ServicePedido;

@RestController
public class ControllerPedido {
	@Autowired
	ServicePedido service;

	@GetMapping(value = "/pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> listarPedidos() {

		return service.listarPedidos();
	}

	@GetMapping(value = "/pedidos/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Pedido buscarPedidoPorId(@PathVariable("codigo") int codigo) {

		return service.buscarPedidoPorId(codigo);
	}

	@PutMapping(value = "/pedidos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarPedido(@RequestBody Pedido pedido) {

		service.crearPedido(pedido);

	}

	@PostMapping(value = "/pedidos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearPedido(@RequestBody Pedido pedido) {

		service.crearPedido(pedido);

	}

	@DeleteMapping(value = "/pedidos/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void borrarPedido(@PathVariable("codigo") int codigoPedido) {

		service.borrarPedido(codigoPedido);
	}
}
