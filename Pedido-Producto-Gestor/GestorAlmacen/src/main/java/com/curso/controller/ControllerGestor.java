package com.curso.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;

import com.curso.service.ServiceGestor;

@RestController
public class ControllerGestor {

	@Autowired
	ServiceGestor service;

	@PostMapping(value = "/aceptar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> aceptarPedido(@RequestBody Pedido pedido) {
		return service.aceptarPedido(pedido);
	}

	@DeleteMapping(value = "borrar/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> cancelarPedido(@PathVariable("codigo") int codigo) {

		return service.cancelarPedido(codigo);
	}

}