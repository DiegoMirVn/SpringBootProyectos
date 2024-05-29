package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curso.dao.DaoPedido;
import com.curso.model.Pedido;

@Service
public class ServicePedidoImp implements ServicePedido {
	@Autowired
	DaoPedido dao;

	@Override
	public void crearPedido(Pedido pedido) {

		dao.save(pedido);

	}

	@Override
	public void actualizarPedido(Pedido pedido) {

		dao.save(pedido);

	}

	@Override
	public List<Pedido> listarPedidos() {

		return dao.findAll();
	}

	@Override
	public void borrarPedido(int codigoPedido) {

		dao.deleteById(codigoPedido);
	}

	@Override
	public Pedido buscarPedidoPorId(int codigo) {

		return dao.findById(codigo).orElse(null);
	}

}
