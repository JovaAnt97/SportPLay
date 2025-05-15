package com.mx.mr.job.Dto;

import java.util.Date;

public class EstadisticaPartidoDto {
	private Long idEstadisticaPartido;
	private Long idPartido;
	private Long idEquipo;
	private Integer asistencias;
	private Integer goles;
	private Integer tarjetaAmarilla;
	private Integer tarjetaRoja;
	private Integer faltas;
	private Date fechaRegistro;
	private Date fechaActualizacion;

	

	public Long getIdEstadisticaPartido() {
		return idEstadisticaPartido;
	}

	public void setIdEstadisticaPartido(Long idEstadisticaPartido) {
		this.idEstadisticaPartido = idEstadisticaPartido;
	}

	public Long getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}

	public Long getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Long idEquipo) {
		this.idEquipo = idEquipo;
	}

	public Integer getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(Integer asistencias) {
		this.asistencias = asistencias;
	}

	public Integer getGoles() {
		return goles;
	}

	public void setGoles(Integer goles) {
		this.goles = goles;
	}

	public Integer getTarjetaAmarilla() {
		return tarjetaAmarilla;
	}

	public void setTarjetaAmarilla(Integer tarjetaAmarilla) {
		this.tarjetaAmarilla = tarjetaAmarilla;
	}

	public Integer getTarjetaRoja() {
		return tarjetaRoja;
	}

	public void setTarjetaRoja(Integer tarjetaRoja) {
		this.tarjetaRoja = tarjetaRoja;
	}

	public Integer getFaltas() {
		return faltas;
	}

	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
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
