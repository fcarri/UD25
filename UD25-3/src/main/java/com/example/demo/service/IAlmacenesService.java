package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Almacenes;

public interface IAlmacenesService {
	
	//Metodos del CRUD
		public List<Almacenes> listarAlmacenes(); //Listar All 
		
		public Almacenes guardarAlmacenes(Almacenes almacen);	//Guarda un cliente CREATE
		
		public Almacenes almacenesXCODIGO(long codigo); //Leer datos de un cliente READ
		
		public Almacenes actualizarAlmacenes(Almacenes almacen); //Actualiza datos del cliente UPDATE
		
		public void eliminarAlmacenes(long codigo);// Elimina el cliente DELETE

}
