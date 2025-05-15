package com.mx.mr.job.Dto;

import java.util.Date;

public class CategoriaDto {
	private Long idCategoria;
	private String nombreCategoria;
	private Integer rangoInicial;
	private Integer rangoFinal;
	private Date fechaRegistro;
	private Date fechaActualizacion;
	
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public Integer getRangoInicial() {
		return rangoInicial;
	}
	public void setRangoInicial(Integer rangoInicial) {
		this.rangoInicial = rangoInicial;
	}
	public Integer getRangoFinal() {
		return rangoFinal;
	}
	public void setRangoFinal(Integer rangoFinal) {
		this.rangoFinal = rangoFinal;
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
