package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Producto;

public interface DaoProd extends JpaRepository<Producto, Integer> {

}
