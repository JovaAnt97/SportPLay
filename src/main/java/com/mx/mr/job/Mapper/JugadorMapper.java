package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mr.job.Dto.JugadorDto;

public class JugadorMapper <T> implements RowMapper<JugadorDto>{
	@Override
	public JugadorDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		JugadorDto jugador = new JugadorDto();
		jugador.setIdJugador(rs.getLong("ID JUGADOR"));
		jugador.setIdEquipo(rs.getLong("ID EQUIPO"));
		jugador.setIdUsuario(rs.getLong("ID USUARIO"));
		jugador.setIdPosicion(rs.getLong("ID POSICION"));
		jugador.setFechaRegistro(rs.getDate("FECHA DE REGISTRO"));
		return jugador;
	}
}
