package com.resumen.backend.apirest.entity.services;

import java.util.List;

import com.resumen.backend.apirest.models.entity.Pais;


public interface ResumenService {
	
	public List<Pais> findAllPaises(); 
	
	public List<Pais> findByPais(String nombre);

}
