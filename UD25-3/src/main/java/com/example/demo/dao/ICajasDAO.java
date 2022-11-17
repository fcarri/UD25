package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Cajas;

public interface ICajasDAO extends JpaRepository<Cajas, Long>{
	
	//public List<Cajas> findByNumReferencia(long NumReferencia);

}
