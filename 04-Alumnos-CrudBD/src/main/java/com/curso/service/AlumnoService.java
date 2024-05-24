package com.curso.service;

import java.util.List;


import com.curso.model.Alumno;

public interface AlumnoService {

	public Alumno mostrarAlumnoPorId(int id);

	public List<Alumno> mostrarAlumnos();

	void insertarAlumno(Alumno alumno);

	void borrarAlumno(int id);

	void  modificarAlumno(Alumno alumno);

	void modificarCursoAlumno(String curso, int id);

	public List<Alumno> listarPorGenero(String valorGenero);

	public List<String> recuentoCursos();

	public double calcularMediaEdad();
}
