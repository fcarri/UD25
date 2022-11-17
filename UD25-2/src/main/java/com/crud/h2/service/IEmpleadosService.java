package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Empleados;

public interface IEmpleadosService {
	
	//Metodos del CRUD
	public List<Empleados> listarEmpleados(); //Listar All 
	
	public Empleados guardarEmpleados(Empleados empleados);	//Guarda un video CREATE
	
	public Empleados empleadosXCODIGO(long codigo); //Leer datos de un video READ
	
	public Empleados actualizarEmpleados(Empleados empleados); //Actualiza datos del video UPDATE
	
	public void eliminarEmpleados(long codigo);// Elimina el video DELETE


}
