package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="cajas")
public class Cajas {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numReferencia")
	private long numReferencia;	
	
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;
	
	
	@ManyToOne
    @JoinColumn(name="almacen")
    private Almacenes almacen;
	
	public Cajas() {
		
	}
	
	public Cajas(long numReferencia, String contenido, int valor, Almacenes almacen) {
		
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
		
	}

	public long getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(long numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}
	

}
