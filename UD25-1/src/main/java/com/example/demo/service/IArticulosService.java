package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Articulos;

public interface IArticulosService {
	
	//Metodos del CRUD
			public List<Articulos> listarArticulos(); //Listar All 
			
			public Articulos guardarArticulos(Articulos articulos);	//Guarda un video CREATE
			
			public Articulos articulosXCODIGO(long codigo); //Leer datos de un video READ
			
			public Articulos actualizarArticulos(Articulos articulos); //Actualiza datos del video UPDATE
			
			public void eliminarArticulos(long codigo);// Elimina el video DELETE

}
