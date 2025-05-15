package com.mx.mr.job.Dto;

import java.util.Date;

public class LigaDto {
	private Long idLiga;
	private String nombreLiga;
	private Date fechaRegistro;
	private Date fechaActualizacion;
	
	public Long getIdLiga() {
		return idLiga;
	}
	public void setIdLiga(Long idLiga) {
		this.idLiga = idLiga;
	}
	public String getNombreLiga() {
		return nombreLiga;
	}
	public void setNombreLiga(String nombreLiga) {
		this.nombreLiga = nombreLiga;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	

}
