package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ServiceProd {

	List<Producto> listarProductos();

	Producto actualizarStock(int cod, int unidades);

	Producto obtenerPrecio(int cod);

	void insertarProducto(Producto producto);

	void actualizarProducto(Producto producto);

}
