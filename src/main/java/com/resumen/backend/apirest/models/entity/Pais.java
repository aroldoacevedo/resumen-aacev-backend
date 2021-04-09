package com.resumen.backend.apirest.models.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pais {
	
	@JsonProperty("ID")
	private String id;
	
	@JsonProperty("Country")
	private String nombre;
	
	@JsonProperty("Slug")
	private String slug;
	
	@JsonProperty("CountryCode")
	private String codigo;
	
	@JsonProperty("Confirmed")
	private double confirmado;
	
	@JsonProperty("Deaths")
	private double muertes;
	
	@JsonProperty("Recovered")
	private double recuperacion;
	
	@JsonProperty("Active")
	private double activo;
	
	@JsonProperty("Date")
	private Date fecha;
	
	@JsonProperty("TotalConfirmed")
	private double totalConfirmed;
	
	@JsonProperty("TotalDeaths")
	private double totalDeaths;
	
	@JsonProperty("TotalRecovered")
	private double totalRecovered;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(double confirmado) {
		this.confirmado = confirmado;
	}

	public double getMuertes() {
		return muertes;
	}

	public void setMuertes(double muertes) {
		this.muertes = muertes;
	}

	public double getRecuperacion() {
		return recuperacion;
	}

	public void setRecuperacion(double recuperacion) {
		this.recuperacion = recuperacion;
	}

	public double getActivo() {
		return activo;
	}

	public void setActivo(double activo) {
		this.activo = activo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getTotalConfirmed() {
		return totalConfirmed;
	}

	public void setTotalConfirmed(double totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}

	public double getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(double totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public double getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(double totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

}
