package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Peliculas;

public interface IPeliculasService {

	//Metodos del CRUD
			public List<Peliculas> listarPeliculas(); //Listar All 
			
			public Peliculas guardarPeliculas(Peliculas pelicula);	//Guarda un cliente CREATE
			
			public Peliculas peliculasXCODIGO(long codigo); //Leer datos de un cliente READ
			
			public Peliculas actualizarPeliculas(Peliculas pelicula); //Actualiza datos del cliente UPDATE
			
			public void eliminarPeliculas(long codigo);// Elimina el cliente DELETE
}
