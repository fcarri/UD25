package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Fabricantes;

public interface IFabricantesDAO  extends JpaRepository <Fabricantes, Long> {
	
	public List<Fabricantes> findByNombre(String nombre);

}
