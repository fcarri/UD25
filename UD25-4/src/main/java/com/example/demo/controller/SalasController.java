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

import com.example.demo.dto.Salas;
import com.example.demo.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {
	
	@Autowired
	SalasServiceImpl SalasServiceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas(){
		return SalasServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarSalas(@RequestBody Salas salas) {
		
		return SalasServiceImpl.guardarSalas(salas);
	}
	
	@GetMapping("/salas/{codigo}")
	public Salas salasXCODIGO(@PathVariable(name="codigo") long codigo) {
		
		Salas salas_xcodigo= new Salas();
		
		salas_xcodigo=SalasServiceImpl.salasXCODIGO(codigo);
		
		System.out.println("Salas XCodigo: "+salas_xcodigo);
		
		return salas_xcodigo;
	}
	
	@PutMapping("/salas/{codigo}")
	public Salas actualizarSalas(@PathVariable(name="codigo")long codigo,@RequestBody Salas salas) {
		
		Salas Salas_seleccionado= new Salas();
		Salas Salas_actualizado= new Salas();
		
		Salas_seleccionado= SalasServiceImpl.salasXCODIGO(codigo);		
		Salas_seleccionado.setCodigo(salas.getCodigo());
		Salas_seleccionado.setNombre(salas.getNombre());
		Salas_seleccionado.setPelicula(salas.getPelicula());
		
		Salas_actualizado = SalasServiceImpl.actualizarSalas(Salas_seleccionado);		
		
		return Salas_actualizado;
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSalas(@PathVariable(name="codigo")long codigo) {
		SalasServiceImpl.eliminarSalas(codigo);
	}
	

}
