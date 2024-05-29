package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.DaoProd;
import com.curso.model.Producto;

@Service
public class ServiceProdImpl implements ServiceProd {

	@Autowired
	DaoProd dao;

	@Override
	public List<Producto> listarProductos() {

		return dao.findAll();
	}

	/*
	 * Actualiza el numero de unidades al llamar al metodo, pasandole el codigo de
	 * prod y las unidades que se han comprado de ese prod para que las reste.
	 */
	@Override
	public Producto actualizarStock(int cod, int unidades) {

		Producto prodActualizado = dao.findById(cod).orElse(null);

		if (prodActualizado.getStock() > unidades) {

			int udActualizado = prodActualizado.getStock() - unidades;

			prodActualizado.setStock(udActualizado);

			dao.save(prodActualizado);

		} else {
			System.out.println("No hay unidades suficientes");
		}

		return prodActualizado;
	}

	@Override
	public Producto obtenerPrecio(int cod) {

		return dao.findById(cod).orElse(null);
	}

	@Override
	public void insertarProducto(Producto producto) {
		dao.save(producto);

	}
	@Override
	public void actualizarProducto(Producto producto) {
		dao.save(producto);

	}

}
