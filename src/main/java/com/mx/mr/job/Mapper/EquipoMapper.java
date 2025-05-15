package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import com.mx.mr.job.Dto.EquipoDto;

@Service
public class EquipoMapper <T> implements RowMapper<EquipoDto>{
	@Override
	public EquipoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EquipoDto equipo = new EquipoDto();
		equipo.setIdEquipo(rs.getLong("ID EQUIPO"));
		equipo.setIdLiga(rs.getLong("ID LIGA"));
		equipo.setIdCategoria(rs.getLong("ID CATEGORIA"));
		equipo.setLogoEquipo(rs.getString("LOGO DEL EQUIPO"));
		equipo.setNombreEquipo(rs.getString("NOMBRE"));
		equipo.setTemporada(rs.getString("TEMPORADA"));
		equipo.setEstado(rs.getString("ESTADO"));
		equipo.setFechaRegistro(rs.getDate("FECHA_REGISTRO"));
		
		
		return equipo;
	}

}
