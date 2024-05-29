package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface ServiceGestor {

	List<Pedido> aceptarPedido(Pedido pedido);

	List<Pedido> cancelarPedido(int codigo);

	

}
