package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="fabricantes")
public class Fabricantes {
	
	//Atributos de entidad 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db				
		private long codigo;			
		
		@Column(name = "nombre")
		private String nombre;
		
		
	    @OneToMany
	    @JoinColumn(name="codigo")
	    private List<Articulos> articulos;
		
		//Constructores
		
		public Fabricantes() {
		
		}
		
		public Fabricantes(long codigo, String nombre ) {
	
			this.nombre = nombre;
			this.codigo = codigo;
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

		public List<Articulos> getArticulos() {
			return articulos;
		}

		public void setArticulos(List<Articulos> articulos) {
			this.articulos = articulos;
		}

		@Override
		public String toString() {
			return "Fabricantes [codigo=" + codigo + ", nombre=" + nombre + ", articulos=" + articulos + "]";
		}
		
		

		
		

}
