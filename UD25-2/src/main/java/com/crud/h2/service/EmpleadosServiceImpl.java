package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadosDAO;
import com.crud.h2.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService{
	
	@Autowired
	IEmpleadosDAO iEmpleadosDAO;
	
	@Override
	public List<Empleados> listarEmpleados() {
		
		return iEmpleadosDAO.findAll();
	}
	
	@Override
	public Empleados guardarEmpleados(Empleados empleados) {
		
		return iEmpleadosDAO.save(empleados);
	}

	@Override
	public Empleados empleadosXCODIGO(long codigo) {
		
		return iEmpleadosDAO.findById(codigo).get();
	}

	@Override
	public Empleados actualizarEmpleados(Empleados empleados) {
		
		return iEmpleadosDAO.save(empleados);
	}

	@Override
	public void eliminarEmpleados(long codigo) {
		
		iEmpleadosDAO.deleteById(codigo);
		
	}

}
