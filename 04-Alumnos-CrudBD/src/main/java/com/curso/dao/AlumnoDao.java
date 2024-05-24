package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Alumno;

public interface AlumnoDao extends JpaRepository<Alumno, Integer> {

	@Query("SELECT a FROM Alumno a WHERE a.genero = :genero")
	public List<Alumno> listarPorGenero(@Param("genero") String valorGenero);


	@Query("SELECT count(a),a.curso FROM Alumno a GROUP BY a.curso")
	public List<String> recuentoCursos();

	
	 @Query("SELECT AVG(a.edad) FROM Alumno a ")
	public double calcularMediaEdad();
	 
	
	@Transactional
	@Modifying
	@Query("UPDATE Alumno a SET a.curso = :curso WHERE a.id = :id")
	void modificarCursoAlumno(@Param("curso") String curso, @Param("id") int id);

}
