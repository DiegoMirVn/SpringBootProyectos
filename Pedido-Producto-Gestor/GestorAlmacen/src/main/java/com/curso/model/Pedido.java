package com.curso.model;

import java.util.Objects;


public class Pedido {

	private int numeroPedido;
	private String direccion;

	private int codigoProducto;
	private int unidades;

	public Pedido() {
		super();

	}

	public Pedido(int numeroPedido, String direccion, int codigoProducto, int unidades) {
		super();
		this.numeroPedido = numeroPedido;
		this.direccion = direccion;
		this.codigoProducto = codigoProducto;
		this.unidades = unidades;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return numeroPedido == other.numeroPedido;
	}

}
