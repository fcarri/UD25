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

import com.example.demo.dto.Cajas;
import com.example.demo.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {


	@Autowired
	CajasServiceImpl CajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return CajasServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas salvarCajas(@RequestBody Cajas cajas) {
		
		return CajasServiceImpl.guardarCajas(cajas);
	}
	
	@GetMapping("/cajas/{numReferencia}")
	public Cajas cajasXCODIGO(@PathVariable(name="numReferencia") long numReferencia) {
		
		Cajas cajas_xcodigo= new Cajas();
		
		cajas_xcodigo=CajasServiceImpl.cajasXCODIGO(numReferencia);
		
		System.out.println("Cajas XCodigo: "+cajas_xcodigo);
		
		return cajas_xcodigo;
	}
	
	@PutMapping("/cajas/{numReferencia}")
	public Cajas actualizarCajas(@PathVariable(name="numReferencia")long numReferencia,@RequestBody Cajas cajas) {
		
		Cajas Cajas_seleccionado= new Cajas();
		Cajas Cajas_actualizado= new Cajas();
		
		Cajas_seleccionado= CajasServiceImpl.cajasXCODIGO(numReferencia);		
		Cajas_seleccionado.setNumReferencia(cajas.getNumReferencia());
		Cajas_seleccionado.setContenido(cajas.getContenido());
		Cajas_seleccionado.setValor(cajas.getValor());
		Cajas_seleccionado.setAlmacen(cajas.getAlmacen());
		
		Cajas_actualizado = CajasServiceImpl.actualizarCajas(Cajas_seleccionado);
		
		System.out.println("El Articulo actualizado es: "+ Cajas_actualizado);
		
		return Cajas_actualizado;
	}
	
	@DeleteMapping("/cajas/{numReferencia}")
	public void eliminarCajas(@PathVariable(name="numReferencia")long numReferencia) {
		CajasServiceImpl.eliminarCajas(numReferencia);
	}
	
}
