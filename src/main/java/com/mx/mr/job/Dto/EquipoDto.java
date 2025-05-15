package com.mx.mr.job.Dto;

import java.util.Date;

public class EquipoDto {
	private Long idEquipo;
	private Long idLiga;
	private Long idCategoria;
	private String logoEquipo;
	private String nombreEquipo;
	private String temporada;
	private String estado;
	private Date fechaRegistro;
	private Date fechaActualizacion;
	

	public Long getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(Long idEquipo) {
		this.idEquipo = idEquipo;
	}
	public Long getIdLiga() {
		return idLiga;
	}
	public void setIdLiga(Long idLiga) {
		this.idLiga = idLiga;
	}
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getLogoEquipo() {
		return logoEquipo;
	}
	public void setLogoEquipo(String logoEquipo) {
		this.logoEquipo = logoEquipo;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
