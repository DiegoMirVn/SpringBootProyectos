package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface ServicePedido {

	void altaPedido(Pedido pedido);

	List<Pedido> listarPedidos();

	void borrarPedido(int numeroPedido);

}
