package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface ServicePedido {

	void crearPedido(Pedido pedido);

	void actualizarPedido(Pedido pedido);

	List<Pedido> listarPedidos();

	Pedido buscarPedidoPorId(int codigo);

	void borrarPedido(int numeroPedido);

}
