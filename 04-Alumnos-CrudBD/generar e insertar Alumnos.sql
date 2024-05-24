DROP SCHEMA IF EXISTS `instituto`;
CREATE SCHEMA `instituto` ;
USE `instituto`;
create table alumnos (
	id INT,
	nombre VARCHAR(50),
	apellido VARCHAR(50),
	curso VARCHAR(10),
	edad INT,
	genero VARCHAR(50)
);
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (1, 'Byrann', 'Brisset', 'Javascript', 61, 'Male');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (2, 'Eyde', 'Rippen', 'Javascript', 44, 'Female');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (3, 'Cece', 'Latour', 'Python', 47, 'Male');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (4, 'Clara', 'Belchamber', 'Javascript', 62, 'Female');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (5, 'Yorgo', 'Joule', 'SQL', 19, 'Male');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (6, 'Mariejeanne', 'Feore', 'Java', 64, 'Female');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (7, 'Vaclav', 'Parlor', 'SQL', 45, 'Male');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (8, 'Angele', 'Preuvost', 'SQL', 65, 'Female');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (9, 'Dyane', 'Adkin', 'Javascript', 20, 'Female');
insert into alumnos (id, nombre, apellido, curso, edad, genero) values (10, 'Gavin', 'Scantlebury', 'Docker', 52, 'Non-binary');
