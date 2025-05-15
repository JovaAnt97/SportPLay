package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mr.job.Dto.EstadisticaPartidoDto;

public class EstadisticaPartidoMapper <T> implements RowMapper<EstadisticaPartidoDto>{
	@Override
	public EstadisticaPartidoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EstadisticaPartidoDto estadisticaPartido = new EstadisticaPartidoDto();
		estadisticaPartido.setIdEstadisticaPartido(rs.getLong("ID ESTADISTICAS DEL PARTIDO"));
		estadisticaPartido.setIdPartido(rs.getLong("ID PARTIDO"));
		estadisticaPartido.setIdEquipo(rs.getLong("ID EQUIPO"));
		estadisticaPartido.setAsistencias(rs.getInt("ASISTENCIAS"));
		estadisticaPartido.setGoles(rs.getInt("GOLES "));
		estadisticaPartido.setTarjetaAmarilla(rs.getInt("TARJETAS AMARILLAS"));
		estadisticaPartido.setTarjetaRoja(rs.getInt("TARJETAS ROJAS"));
		estadisticaPartido.setFaltas(rs.getInt("FALTAS"));
		estadisticaPartido.setFechaRegistro(rs.getDate("FECHA DE REGISTRO"));
		return estadisticaPartido;
	}
}
