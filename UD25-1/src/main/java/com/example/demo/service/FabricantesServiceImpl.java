package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricantesDAO;
import com.example.demo.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricantesService{
	
	//Utilizamos los metodos de la interface IFabricantesDAO, es como si instaciaramos.
		@Autowired
		IFabricantesDAO iFabricantesDAO;
		
		@Override
		public List<Fabricantes> listarFabricantes() {
			
			return iFabricantesDAO.findAll();
		}

		@Override
		public Fabricantes guardarFabricantes(Fabricantes fabricantes) {
			
			return iFabricantesDAO.save(fabricantes);
		}

		@Override
		public Fabricantes fabricantesXCODIGO(long codigo) {
			
			return iFabricantesDAO.findById(codigo).get();
		}

		@Override
		public Fabricantes actualizarFabricantes(Fabricantes fabricantes) {
			
			return iFabricantesDAO.save(fabricantes);
		}

		@Override
		public void eliminarFabricantes(long codigo) {
			
			iFabricantesDAO.deleteById(codigo);
			
		}

}
