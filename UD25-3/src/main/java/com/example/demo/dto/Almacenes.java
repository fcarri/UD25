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
@Table(name="almacenes")
public class Almacenes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;	
	
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private int capacidad;
	
	 @OneToMany
	 @JoinColumn(name="codigo")
	 private List<Cajas> cajas;
	 
	
	public Almacenes() {
		 
	 }
	 
	 public Almacenes(long codigo, String lugar, int capacidad) {
		 
		 this.codigo = codigo;
		 this.lugar = lugar;
		 this.capacidad = capacidad;
	 }
	 	 

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Cajas> getCajas() {
		return cajas;
	}

	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}

	


}
