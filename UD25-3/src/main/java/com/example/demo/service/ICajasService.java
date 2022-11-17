package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Cajas;

public interface ICajasService {
	
	public List<Cajas> listarCajas(); //Listar All 
	
	public Cajas guardarCajas(Cajas cajas);	//Guarda un cliente CREATE
	
	public Cajas cajasXCODIGO(long numReferencia); //Leer datos de un cliente READ
	
	public Cajas actualizarCajas(Cajas cajas); //Actualiza datos del cliente UPDATE
	
	public void eliminarCajas(long numReferencia);// Elimina el cliente DELETE

}
