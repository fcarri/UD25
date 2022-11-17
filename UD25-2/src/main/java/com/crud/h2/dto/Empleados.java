package com.crud.h2.dto;

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
@Table(name="Empleados")
public class Empleados {
	
	//Atributos de entidad 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		
		@Column(name = "DNI")
		private int DNI;	
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "apellidos")
		private String apellidos;
		
		@ManyToOne
	    @JoinColumn(name="departamento")
	    private Departamentos departamentos;
		
		public Empleados() {
			
		}
		
		public Empleados(int DNI, String nombre, String apellidos, Departamentos departamentos) {
			
			this.departamentos = departamentos;
			this.apellidos = apellidos;
			this.nombre = nombre;
			this.DNI = DNI;
		}

		public int getDNI() {
			return DNI;
		}

		public void setDNI(int dNI) {
			DNI = dNI;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public Departamentos getDepartamentos() {
			return departamentos;
		}

		public void setDepartamentos(Departamentos departamentos) {
			this.departamentos = departamentos;
		}

		@Override
		public String toString() {
			return "Empleados [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamentos="
					+ departamentos + "]";
		}
		
		

}
