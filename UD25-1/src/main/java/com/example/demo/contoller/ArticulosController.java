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

import com.example.demo.dto.Articulos;
import com.example.demo.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {
	
	@Autowired
	ArticulosServiceImpl ArticulosServiceImpl;
	
	@GetMapping("/Articulos")
	public List<Articulos> listarArticuloss(){
		return ArticulosServiceImpl.listarArticulos();
	}
	
	@PostMapping("/Articulos")
	public Articulos salvarArticulos(@RequestBody Articulos articulos) {
		
		return ArticulosServiceImpl.guardarArticulos(articulos);
	}
	
	@GetMapping("/Articulos/{codigo}")
	public Articulos articulosXCODIGO(@PathVariable(name="codigo") long codigo) {
		
		Articulos articulos_xcodigo= new Articulos();
		
		articulos_xcodigo=ArticulosServiceImpl.articulosXCODIGO(codigo);
		
		System.out.println("Articulos XCodigo: "+articulos_xcodigo);
		
		return articulos_xcodigo;
	}
	
	@PutMapping("/Articulos/{codigo}")
	public Articulos actualizarArticulos(@PathVariable(name="codigo")long codigo,@RequestBody Articulos articulos) {
		
		Articulos Articulos_seleccionado= new Articulos();
		Articulos Articulos_actualizado= new Articulos();
		
		Articulos_seleccionado= ArticulosServiceImpl.articulosXCODIGO(codigo);		
		Articulos_seleccionado.setCodigo(articulos.getCodigo());
		Articulos_seleccionado.setNombre(articulos.getNombre());
		Articulos_seleccionado.setPrecio(articulos.getPrecio());
		Articulos_seleccionado.setFabricantes(articulos.getFabricantes());
		
		Articulos_actualizado = ArticulosServiceImpl.actualizarArticulos(Articulos_seleccionado);
		
		return Articulos_actualizado;
	}
	
	@DeleteMapping("/Articulos/{codigo}")
	public void eliminarArticulos(@PathVariable(name="codigo")long codigo) {
		ArticulosServiceImpl.eliminarArticulos(codigo);
	}

}
