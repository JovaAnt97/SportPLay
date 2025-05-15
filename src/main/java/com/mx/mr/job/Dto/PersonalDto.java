package com.mx.mr.job.Dto;

import java.util.Date;

public class PersonalDto {
	private Long idPersonal;
	private Long idEquipo;
	private String nombrePersonal;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Integer edad;
	private String rol;
	private Integer fechaIngreso;
	private Date fechaRegistro;
	private Date fechaActualizacion;
	//private String estado;
	
	
	
	
	public Long getIdPersonal() {
		return idPersonal;
	}
	public void setIdPersonal(Long idPersonal) {
		this.idPersonal = idPersonal;
	}
	public Long getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(Long idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getNombrePersonal() {
		return nombrePersonal;
	}
	public void setNombrePersonal(String nombrePersonal) {
		this.nombrePersonal = nombrePersonal;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public Integer getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Integer fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
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
