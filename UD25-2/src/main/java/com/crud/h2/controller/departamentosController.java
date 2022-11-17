package com.crud.h2.controller;

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

import com.crud.h2.dto.Departamentos;
import com.crud.h2.service.DepartamentosServiceImpl;

@RestController
@RequestMapping("/api")
public class departamentosController {
	
	@Autowired
	DepartamentosServiceImpl DepartamentosServiceImpl;
	
	@GetMapping("/Departamentos")
	public List<Departamentos> listarFabricantes(){
		return DepartamentosServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/Departamentos")
	public Departamentos salvarDepartamentos(@RequestBody Departamentos departamentos) {
		
		return DepartamentosServiceImpl.guardarDepartamentos(departamentos);
	}
	
	@GetMapping("/Departamentos/{codigo}")
	public Departamentos DepartamentosXCODIGO(@PathVariable(name="codigo") long codigo) {
		
		Departamentos departamentos_xcodigo= new Departamentos();
		
		departamentos_xcodigo=DepartamentosServiceImpl.departamentosXCODIGO(codigo);
		
		System.out.println("Departamentos XCODIGO: "+departamentos_xcodigo);
		
		return departamentos_xcodigo;
	}
	
	@PutMapping("/Departamentos/{codigo}")
	public Departamentos actualizarFabricantes(@PathVariable(name="codigo")long codigo,@RequestBody Departamentos departamentos) {
		
		Departamentos departamentos_seleccionado= new Departamentos();
		Departamentos departamentos_actualizado= new Departamentos();
		
		departamentos_seleccionado= DepartamentosServiceImpl.departamentosXCODIGO(codigo);
		
		departamentos_seleccionado.setCodigo(departamentos.getCodigo());
		departamentos_seleccionado.setNombre(departamentos.getNombre());
		departamentos_seleccionado.setPresupuesto(departamentos.getPresupuesto());
						
		departamentos_actualizado = DepartamentosServiceImpl.actualizarDepartamentos(departamentos_seleccionado);
		
		System.out.println("El Departamento actualizado es: "+ departamentos_actualizado);
		
		return departamentos_actualizado;
	}
	
	@DeleteMapping("/Departamentos/{codigo}")
	public void eliminarDepartamentos(@PathVariable(name="codigo")long codigo) {
		DepartamentosServiceImpl.eliminarDepartamentos(codigo);
	}

}
