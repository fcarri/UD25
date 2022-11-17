package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Peliculas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "calificacion")
	private int calificacion;
	
	@OneToMany
    @JoinColumn(name="codigo")
	private List<Salas> salas;
	
	public Peliculas(){
		
	}
	
	public Peliculas(long codigo, String nombre, int calificacion){
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacion = calificacion;
				
	}
	

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public List<Salas> getSalas() {
		return salas;
	}

	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}
	
	

}
