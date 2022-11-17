package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculasDAO;
import com.example.demo.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService{

	@Autowired
	IPeliculasDAO iPeliculasDAO;
	
	@Override
	public List<Peliculas> listarPeliculas() {
		
		return iPeliculasDAO.findAll();
	}

	@Override
	public Peliculas guardarPeliculas(Peliculas pelicula) {
		
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public Peliculas peliculasXCODIGO(long codigo) {
		
		return iPeliculasDAO.findById(codigo).get();
	}

	@Override
	public Peliculas actualizarPeliculas(Peliculas pelicula) {
		
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public void eliminarPeliculas(long codigo) {
		
		iPeliculasDAO.deleteById(codigo);
		
	}

}
