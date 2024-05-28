package com.curso.service;



import java.util.List;

import com.curso.model.Formacion;

public interface ServiceFormacion {

	List<Formacion> mostrarTodo( );

	void altaCurso(Formacion formacion);
}
