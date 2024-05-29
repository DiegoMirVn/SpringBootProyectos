package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ServiceProd;

@RestController
public class ControllerProd {
	@Autowired
	ServiceProd service;

	@GetMapping(value = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> listarProductos() {

		return service.listarProductos();
	}

	@PutMapping(value = "/productos/{cod}/{ud}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Producto actualizarStock(@PathVariable("cod") int cod, @PathVariable("ud") int unidades) {

		return service.actualizarStock(cod, unidades);

	}

	@GetMapping(value = "/productos/{cod}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Producto obtenerPrecio(@PathVariable("cod") int cod) {

		return service.obtenerPrecio(cod);
	}

	@PostMapping(value = "/productos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertarProducto(@RequestBody Producto producto) {
		service.insertarProducto(producto);
	}

	@PutMapping(value = "/productos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarProducto(@RequestBody Producto producto) {
		service.actualizarProducto(producto);
	}
}
