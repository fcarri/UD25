package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticulosDAO;
import com.example.demo.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticulosService {
	
	
	@Autowired
	IArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulos> listarArticulos() {
		
		return iArticulosDAO.findAll();
	}
	
	@Override
	public Articulos guardarArticulos(Articulos articulos) {
		
		return iArticulosDAO.save(articulos);
	}

	@Override
	public Articulos articulosXCODIGO(long codigo) {
		
		return iArticulosDAO.findById(codigo).get();
	}

	@Override
	public Articulos actualizarArticulos(Articulos articulos) {
		
		return iArticulosDAO.save(articulos);
	}

	@Override
	public void eliminarArticulos(long codigo) {
		
		iArticulosDAO.deleteById(codigo);
		
	}
}
