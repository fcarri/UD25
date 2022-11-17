package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Empleados;

public interface IEmpleadosDAO extends JpaRepository<Empleados, Long>{

}
