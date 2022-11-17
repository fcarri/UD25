package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long>{
	
	public List<Articulos> findByNombre(String nombre);

}
