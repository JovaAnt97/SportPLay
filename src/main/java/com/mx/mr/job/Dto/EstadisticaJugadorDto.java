package com.mx.mr.job.Dto;

import java.util.Date;

public class EstadisticaJugadorDto {
	private Long idEstadisticaJugador;
	private Long idJugador;
	private Long idPartido;
	private Integer goles;
	private Integer asistencias;
//	private BigDecimal golPorPartido; ESTE VALOR SE SACARA CON ESTADISTICAS
	private Integer tarjetaAmarilla;
	private Integer tarjetaRoja;
	private Integer minutosJugados;
	private Date fechaRegistro;
	private Date fechaActualizacion;
	private String nombreUsuario;
	private String nombreEquipo;
	
	
	
	
	public Long getIdEstadisticaJugador() {
		return idEstadisticaJugador;
	}
	public void setIdEstadisticaJugador(Long idEstadisticaJugador) {
		this.idEstadisticaJugador = idEstadisticaJugador;
	}
	public Long getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(Long idJugador) {
		this.idJugador = idJugador;
	}
	public Long getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}
	public Integer getGoles() {
		return goles;
	}
	public void setGoles(Integer goles) {
		this.goles = goles;
	}
	public Integer getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(Integer asistencias) {
		this.asistencias = asistencias;
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
	public Integer getMinutosJugados() {
		return minutosJugados;
	}
	public void setMinutosJugados(Integer minutosJugados) {
		this.minutosJugados = minutosJugados;
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
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
		
	
}
