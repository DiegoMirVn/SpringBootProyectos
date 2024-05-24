package com.curso.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Alumno;
import com.curso.service.AlumnoService;


@RestController
public class AlumnoController {

	@Autowired
	AlumnoService service;

	@GetMapping(value = "alumno/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Alumno mostrarAlumnoPorId(@PathVariable("id") int id) {
		return service.mostrarAlumnoPorId(id);
	}

	@GetMapping(value = "alumno", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Alumno> mostrarAlumnos() {

		return service.mostrarAlumnos();
	}

	@PostMapping(value = "alumno", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertarAlumno(@RequestBody Alumno alumno) {
		service.insertarAlumno(alumno);
	}

	@DeleteMapping(value = "alumno/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void borrarAlumno(@PathVariable ("id") int id) {

		service.borrarAlumno(id);
	}

	@PutMapping(value = "alumno", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarAlumno(@RequestBody Alumno alumno) {

		service.modificarAlumno(alumno);
	}

	@PutMapping(value = "alumno/{id}/{curso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void modificarCursoAlumno(@PathVariable ("id") int id, @PathVariable ("curso") String curso) {
		service.modificarCursoAlumno(curso, id);

	}

	@GetMapping(value = "alumno/genero/{valor}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Alumno> listarPorGenero(@PathVariable ("valor")  String valorGenero) {

		return service.listarPorGenero(valorGenero);
	}

	@GetMapping(value = "alumno/recuento", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> recuentoCursos() {
		return service.recuentoCursos();
	}

	@GetMapping(value = "alumno/media", produces = MediaType.APPLICATION_JSON_VALUE)
	public double calcularMediaEdad() {
		return service.calcularMediaEdad();
	}

}
