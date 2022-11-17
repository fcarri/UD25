package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Salas;

public interface ISalasService {

	public List<Salas> listarSalas(); //Listar All 
	
	public Salas guardarSalas(Salas salas);	//Guarda un cliente CREATE
	
	public Salas salasXCODIGO(long codigo); //Leer datos de un cliente READ
	
	public Salas actualizarSalas(Salas salas); //Actualiza datos del cliente UPDATE
	
	public void eliminarSalas(long codigo);// Elimina el cliente DELETE
}
