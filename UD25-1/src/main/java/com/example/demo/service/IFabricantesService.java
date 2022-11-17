package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Fabricantes;

public interface IFabricantesService {
	
	//Metodos del CRUD
	public List<Fabricantes> listarFabricantes(); //Listar All 
	
	public Fabricantes guardarFabricantes(Fabricantes fabricantes);	//Guarda un cliente CREATE
	
	public Fabricantes fabricantesXCODIGO(long codigo); //Leer datos de un cliente READ
	
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes); //Actualiza datos del cliente UPDATE
	
	public void eliminarFabricantes(long codigo);// Elimina el cliente DELETE

}
