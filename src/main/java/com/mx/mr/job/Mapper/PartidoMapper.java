package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mr.job.Dto.PartidoDto;

public class PartidoMapper <T> implements RowMapper<PartidoDto>{
	@Override
	public PartidoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		PartidoDto partido = new PartidoDto();
		partido.setIdPartido(rs.getLong("ID CATEGORIA"));
		partido.setCampo(rs.getString("CAMPO"));
		partido.setFechaPartido(rs.getDate("FECHA "));
		partido.setHora(rs.getDate("HORA"));
		partido.setEstado(rs.getString("ESTADO"));
		partido.setResultado(rs.getString("RESULTADO"));
		partido.setPuntos(rs.getInt("PUNTOS"));
		partido.setComentarios(rs.getString("COMENTARIOS"));
		partido.setFechaRegistro(rs.getDate("FECHA DE REGISTRO"));
		return partido;
	}

}
