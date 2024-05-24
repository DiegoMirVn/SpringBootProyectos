package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.AlumnoDao;
import com.curso.model.Alumno;

@Service
public class AlumnoServiceImp implements AlumnoService {

	@Autowired
	AlumnoDao dao;

	@Override
	public Alumno mostrarAlumnoPorId(int id) {
		return dao.findById(id).orElse(null);

	}

	@Override
	public List<Alumno> mostrarAlumnos() {

		return dao.findAll();
	}

	@Override
	public void insertarAlumno(Alumno alumno) {
		dao.save(alumno);

	}

	@Override
	public void borrarAlumno(int id) {

		dao.deleteById(id);
	}

	@Override
	public void modificarAlumno(Alumno alumno) {

		dao.save(alumno);
	}

	@Override
	public void modificarCursoAlumno(String curso, int id) {
		dao.modificarCursoAlumno(curso, id);

	}

	@Override
	public List<Alumno> listarPorGenero(String valorGenero) {

		return dao.listarPorGenero(valorGenero);
	}

	@Override
	public List<String> recuentoCursos() {

		return dao.recuentoCursos();
	}

	@Override
	public double calcularMediaEdad() {

	
		return Math.round((Double) dao.calcularMediaEdad());
	}

}
