package com.example.demo.contoller;

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

import com.example.demo.dto.Fabricantes;
import com.example.demo.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {
	
	@Autowired
	FabricantesServiceImpl FabricantesServiceImpl;
	
	@GetMapping("/Fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return FabricantesServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/Fabricantes")
	public Fabricantes salvarFabricantes(@RequestBody Fabricantes fabricantes) {
		
		return FabricantesServiceImpl.guardarFabricantes(fabricantes);
	}
	
	@GetMapping("/Fabricantes/{codigo}")
	public Fabricantes fabricantesXCODIGO(@PathVariable(name="codigo") long codigo) {
		
		Fabricantes fabricantes_xcodigo= new Fabricantes();
		
		fabricantes_xcodigo=FabricantesServiceImpl.fabricantesXCODIGO(codigo);
		
		System.out.println("Fabricantes XCODIGO: "+fabricantes_xcodigo);
		
		return fabricantes_xcodigo;
	}
	
	@PutMapping("/Fabricantes/{codigo}")
	public Fabricantes actualizarFabricantes(@PathVariable(name="codigo")long codigo,@RequestBody Fabricantes fabricantes) {
		
		Fabricantes fabricantes_seleccionado= new Fabricantes();
		Fabricantes fabricantes_actualizado= new Fabricantes();
		
		fabricantes_seleccionado= FabricantesServiceImpl.fabricantesXCODIGO(codigo);
		
		fabricantes_seleccionado.setCodigo(fabricantes.getCodigo());
		fabricantes_seleccionado.setNombre(fabricantes.getNombre());
						
		fabricantes_actualizado = FabricantesServiceImpl.actualizarFabricantes(fabricantes_seleccionado);
		
		System.out.println("El Fabricantes actualizado es: "+ fabricantes_actualizado);
		
		return fabricantes_actualizado;
	}
	
	@DeleteMapping("/Fabricantes/{codigo}")
	public void eliminarFabricantes(@PathVariable(name="codigo")long codigo) {
		FabricantesServiceImpl.eliminarFabricantes(codigo);
	}

}
