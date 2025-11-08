CREATE DATABASE ausentbase; 

USE ausentbase;

CREATE TABLE Usuario(
	ci int(10),
    password varchar(200)
);

CREATE TABLE Docente(
	ci VARCHAR(8) PRIMARY KEY,
    nombre VARCHAR(50)
);

CREATE TABLE Asignatura(
	id INT PRIMARY KEY AUTO_INCREMENT,
    docente VARCHAR(50),
    nombre VARCHAR(50),
	grupo VARCHAR(50),
    dia VARCHAR(50),
    turno VARCHAR(50),
    CONSTRAINT fk_docente FOREIGN KEY (docente)
    REFERENCES Docente(ci)
    ON DELETE CASCADE
);

CREATE TABLE Inasistencia(
	id INT PRIMARY KEY AUTO_INCREMENT,
    docente VARCHAR(50),
    desde VARCHAR(50),
    hasta VARCHAR(50),
    CONSTRAINT fk_docente_i FOREIGN KEY (docente)
	REFERENCES Docente(ci)
    ON DELETE CASCADE
);