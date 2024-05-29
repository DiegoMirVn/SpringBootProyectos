package com.curso.model;

import java.util.Objects;

public class Producto {

	private int cod;
	private String nombre;
	private int stock;
	private double precio;

	public Producto() {
		super();

	}

	public Producto(int cod, String nombre, int stock, double precio) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cod == other.cod;
	}

}
