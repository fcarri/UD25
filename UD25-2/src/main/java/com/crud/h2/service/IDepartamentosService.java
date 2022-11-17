package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Departamentos;


public interface IDepartamentosService {
	
	//Metodos del CRUD
		public List<Departamentos> listarDepartamentos(); //Listar All 
		
		public Departamentos guardarDepartamentos(Departamentos departamentos);	//Guarda un cliente CREATE
		
		public Departamentos departamentosXCODIGO(long codigo); //Leer datos de un cliente READ
		
		public Departamentos actualizarDepartamentos(Departamentos departamentos); //Actualiza datos del cliente UPDATE
		
		public void eliminarDepartamentos(long codigo);// Elimina el cliente DELETE

}
