package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartamentosDAO;
import com.crud.h2.dto.Departamentos;


@Service
public class DepartamentosServiceImpl implements IDepartamentosService {
	
	@Autowired
	IDepartamentosDAO iDepartamentosDAO;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos departamentos) {
		
		return iDepartamentosDAO.save(departamentos);
	}

	@Override
	public Departamentos departamentosXCODIGO(long codigo) {
		
		return iDepartamentosDAO.findById(codigo).get();
	}

	@Override
	public Departamentos actualizarDepartamentos(Departamentos departamentos) {
		
		return iDepartamentosDAO.save(departamentos);
	}

	@Override
	public void eliminarDepartamentos(long codigo) {
		
		iDepartamentosDAO.deleteById(codigo);
		
	}

	
}
