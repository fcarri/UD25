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
@Table(name="articulos")
public class Articulos {
	
	
	//Atributos de entidad 
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private long codigo;	
			
			@Column(name = "nombre")
			private String nombre;
			@Column(name = "precio")
			private int precio;
			
			
			@ManyToOne
		    @JoinColumn(name="fabricante")
		    private Fabricantes fabricantes;
			
			//Constructores
			
			public Articulos() {
			
			}
			
			public Articulos(long codigo, String nombre, int precio, Fabricantes fabricantes ) {
				
				this.codigo = codigo;
				this.nombre = nombre;				
				this.precio = precio;
				this.fabricantes = fabricantes;
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

			public int getPrecio() {
				return precio;
			}

			public void setPrecio(int precio) {
				this.precio = precio;
			}

			public Fabricantes getFabricantes() {
				return fabricantes;
			}

			public void setFabricantes(Fabricantes fabricantes) {
				this.fabricantes = fabricantes;
			}

		
			
			
									

}
