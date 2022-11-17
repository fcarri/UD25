package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenesDAO;
import com.example.demo.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService {

	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacen) {
		
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacenes almacenesXCODIGO(long codigo) {
		
		return iAlmacenesDAO.findById(codigo).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes almacen) {
		
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacenes(long codigo) {
		
		iAlmacenesDAO.deleteById(codigo);
		
	}

}
