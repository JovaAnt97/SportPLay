package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mr.job.Dto.EstadisticaJugadorDto;

public class EstadisticaJugadorMapper  <T> implements RowMapper<EstadisticaJugadorDto>{
	@Override
	public EstadisticaJugadorDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EstadisticaJugadorDto estadisticaJugador = new EstadisticaJugadorDto();
//		estadisticaJugador.setIdEstadisticaJugador(rs.getLong("ID ESTADISTICA DE JUGADOR"));
//		estadisticaJugador.setIdJugador(rs.getLong("ID JUGADOR"));
//		estadisticaJugador.setIdPartido(rs.getLong("ID PARTIDO"));
		estadisticaJugador.setGoles(rs.getInt("GOLES"));
		estadisticaJugador.setAsistencias(rs.getInt("ASISTENCIAS"));
		estadisticaJugador.setTarjetaAmarilla(rs.getInt("TARJETAS_AMARILLAS"));
		estadisticaJugador.setTarjetaRoja(rs.getInt("TARJETAS_ROJAS"));
//		estadisticaJugador.setMinutosJugados(rs.getInt("MINUTOS JUGADOR "));
//		estadisticaJugador.setFechaRegistro(rs.getDate("FECHA DE REGISTRO"));
		
		return estadisticaJugador;
	}

}
