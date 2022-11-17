package com.crud.h2.controller;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dao.IEmpleadosDAO;
import com.crud.h2.dto.Empleados;
import com.crud.h2.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class empleadosController {
	
	@Autowired
	EmpleadosServiceImpl EmpleadosServiceImpl;
	
	@GetMapping("/Empleados")
	public List<Empleados> listarEmpleadoss(){
		return EmpleadosServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/Empleados")
	public Empleados salvarEmpleados(@RequestBody Empleados empleados) {
		
		return EmpleadosServiceImpl.guardarEmpleados(empleados);
	}
	
	@GetMapping("/Empleados/{codigo}")
	public Empleados EmpleadosXcodigo(@PathVariable(name="codigo") long codigo) {
		
		Empleados empleados_xcodigo= new Empleados();
		
		empleados_xcodigo=EmpleadosServiceImpl.empleadosXCODIGO(codigo);
		
		System.out.println("Empleados XCodigo: "+empleados_xcodigo);
		
		return empleados_xcodigo;
	}
	
	@PutMapping("/Empleados/{codigo}")
	public Empleados actualizarEmpleados(@PathVariable(name="codigo")long codigo,@RequestBody Empleados empleados) {
		
		Empleados Empleados_seleccionado= new Empleados();
		Empleados Empleados_actualizado= new Empleados();
		
		Empleados_seleccionado= EmpleadosServiceImpl.empleadosXCODIGO(codigo);		
		Empleados_seleccionado.setDNI(empleados.getDNI());
		Empleados_seleccionado.setNombre(empleados.getNombre());
		Empleados_seleccionado.setApellidos(empleados.getApellidos());
		Empleados_seleccionado.setDepartamentos(empleados.getDepartamentos());
		
		Empleados_actualizado = EmpleadosServiceImpl.actualizarEmpleados(Empleados_seleccionado);
		
		System.out.println("El Empleados actualizado es: "+ Empleados_actualizado);
		
		return Empleados_actualizado;
	}
	
	@DeleteMapping("/Empleados/{codigo}")
	public void eliminarEmpleados(@PathVariable(name="codigo")long codigo) {
		EmpleadosServiceImpl.eliminarEmpleados(codigo);
	}


}
