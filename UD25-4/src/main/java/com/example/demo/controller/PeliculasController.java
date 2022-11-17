package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Peliculas;
import com.example.demo.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	PeliculasServiceImpl PeliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas(){
		return PeliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Peliculas salvarPeliculas(@RequestBody Peliculas peliculas) {
		
		return PeliculasServiceImpl.guardarPeliculas(peliculas);
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Peliculas peliculasXCODIGO(@PathVariable(name="codigo") long codigo) {
		
		Peliculas peliculas_xcodigo= new Peliculas();
		
		peliculas_xcodigo=PeliculasServiceImpl.peliculasXCODIGO(codigo);
		
		System.out.println("Peliculas XCODIGO: "+peliculas_xcodigo);
		
		return peliculas_xcodigo;
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Peliculas actualizarPeliculas(@PathVariable(name="codigo")long codigo,@RequestBody Peliculas peliculas) {
		
		Peliculas peliculas_seleccionado= new Peliculas();
		Peliculas peliculas_actualizado= new Peliculas();
		
		peliculas_seleccionado= PeliculasServiceImpl.peliculasXCODIGO(codigo);
		
		peliculas_seleccionado.setCodigo(peliculas.getCodigo());
		peliculas_seleccionado.setNombre(peliculas.getNombre());
		peliculas_seleccionado.setCalificacion(peliculas.getCalificacion());
						
		peliculas_actualizado = PeliculasServiceImpl.actualizarPeliculas(peliculas_seleccionado);
		
		return peliculas_actualizado;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPeliculas(@PathVariable(name="codigo")long codigo) {
		PeliculasServiceImpl.eliminarPeliculas(codigo);
	}


	
}
