package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalasDAO;
import com.example.demo.dao.ISalasDAO;
import com.example.demo.dto.Salas;
import com.example.demo.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService{

	@Autowired
	ISalasDAO iSalasDAO;
	
	@Override
	public List<Salas> listarSalas() {
		
		return iSalasDAO.findAll();
	}

	@Override
	public Salas guardarSalas(Salas salas) {
		
		return iSalasDAO.save(salas);
	}

	@Override
	public Salas salasXCODIGO(long codigo) {
		
		return iSalasDAO.findById(codigo).get();
	}

	@Override
	public Salas actualizarSalas(Salas salas) {
		
		return iSalasDAO.save(salas);
	}

	@Override
	public void eliminarSalas(long codigo) {
		
		iSalasDAO.deleteById(codigo);
		
	}

}
