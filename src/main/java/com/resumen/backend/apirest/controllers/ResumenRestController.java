package com.resumen.backend.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resumen.backend.apirest.entity.services.ResumenService;
import com.resumen.backend.apirest.models.entity.Pais;

@CrossOrigin(origins = { "http://localhost:3000", "*" })
@RestController
@RequestMapping("/api")
public class ResumenRestController {

	@Autowired 
	ResumenService paisService;
	
	@GetMapping("/resumen")
	public ResponseEntity<?> index(){
		
		Map<String,Object> response = new HashMap<String, Object>();
		List<Pais> paises = null;
		try {
			paises = paisService.findAllPaises();
		}catch (Exception e) {
			response.put("mensaje", "Error al consumir el servicio");
			response.put("error", e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
		
		if(paises == null || paises.size() == 0) {
			response.put("mensaje", "Paises no encontrado!");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}
	
		return new ResponseEntity<List<Pais>>(paises, HttpStatus.OK);
	}
	
	@GetMapping("/pais/{nombre}")
	public ResponseEntity<?> index(@PathVariable("nombre") String nombre){
		Map<String,Object> response = new HashMap<String, Object>();
		List<Pais> paises = null;
		try {
			paises =paisService.findByPais(nombre);
		}catch (Exception e) {
			response.put("mensaje", "Error al consumir el servicio");
			response.put("error", e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
		
		if(paises == null || paises.size() == 0) {
			response.put("mensaje", "Datos del pais no encontrado!");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}
		
		return new  ResponseEntity<List<Pais>>(paises, HttpStatus.OK);
	}
	
}
