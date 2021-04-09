package com.resumen.backend.apirest.entity.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.resumen.backend.apirest.models.entity.Pais;
import com.resumen.backend.apirest.models.entity.Resumen;

@Service
public class ResumenServiceImpl implements ResumenService {

	RestTemplate restTemplate;
	
	
	private static final String URL_API_RESUMEN =
            "https://api.covid19api.com/summary";
	
	private static final String URL_API_PAISES =
            "https://api.covid19api.com/country";
	
	public ResumenServiceImpl() {
		this.restTemplate = new RestTemplate();
	}

	@Override
	public List<Pais> findAllPaises() {
		ResponseEntity<Resumen> response =
	            restTemplate.getForEntity(URL_API_RESUMEN, Resumen.class);

		Resumen resumen = response.getBody();
		List<Pais> paises = resumen.getPaises(); 
		return paises;
	}

	@Override
	public List<Pais> findByPais(String nombre) {
		ResponseEntity<Pais[]> response =
	            restTemplate.getForEntity(URL_API_PAISES + '/' + nombre, Pais[].class);
		
		Pais[] paises = response.getBody();
		return Arrays.asList(paises);
	}
	
}
