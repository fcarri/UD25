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

import com.example.demo.dto.Almacenes;
import com.example.demo.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {
	
	@Autowired
	AlmacenesServiceImpl AlmacenesServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes(){
		return AlmacenesServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacenes salvarAlmacenes(@RequestBody Almacenes almacenes) {
		
		return AlmacenesServiceImpl.guardarAlmacenes(almacenes);
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacenes almacenesXCODIGO(@PathVariable(name="codigo") long codigo) {
		
		Almacenes almacenes_xcodigo= new Almacenes();
		
		almacenes_xcodigo=AlmacenesServiceImpl.almacenesXCODIGO(codigo);
		
		System.out.println("Almacenes XCODIGO: "+almacenes_xcodigo);
		
		return almacenes_xcodigo;
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacenes actualizarAlmacenes(@PathVariable(name="codigo")long codigo,@RequestBody Almacenes almacenes) {
		
		Almacenes almacenes_seleccionado= new Almacenes();
		Almacenes almacenes_actualizado= new Almacenes();
		
		almacenes_seleccionado= AlmacenesServiceImpl.almacenesXCODIGO(codigo);
		
		almacenes_seleccionado.setCodigo(almacenes.getCodigo());
		almacenes_seleccionado.setLugar(almacenes.getLugar());
		almacenes_seleccionado.setCapacidad(almacenes.getCapacidad());
						
		almacenes_actualizado = AlmacenesServiceImpl.actualizarAlmacenes(almacenes_seleccionado);
		
		System.out.println("El Almacenes actualizado es: "+ almacenes_actualizado);
		
		return almacenes_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacenes(@PathVariable(name="codigo")long codigo) {
		AlmacenesServiceImpl.eliminarAlmacenes(codigo);
	}


}
