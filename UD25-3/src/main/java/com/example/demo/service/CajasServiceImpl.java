package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajasDAO;
import com.example.demo.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService {
	
	@Autowired
	ICajasDAO iCajasDAO;
	
	@Override
	public List<Cajas> listarCajas() {
		
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCajas(Cajas cajas) {
		
		return iCajasDAO.save(cajas);
	}

	@Override
	public Cajas cajasXCODIGO(long numReferencia) {
		
		return iCajasDAO.findById(numReferencia).get();
	}

	@Override
	public Cajas actualizarCajas(Cajas cajas) {
		
		return iCajasDAO.save(cajas);
	}

	@Override
	public void eliminarCajas(long numReferencia) {
		
		iCajasDAO.deleteById(numReferencia);
		
	}


}
