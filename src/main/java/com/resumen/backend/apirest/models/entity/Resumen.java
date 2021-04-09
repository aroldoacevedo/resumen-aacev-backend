package com.resumen.backend.apirest.models.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resumen {

	@JsonProperty("Countries")
	List<Pais> paises;

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}

}
