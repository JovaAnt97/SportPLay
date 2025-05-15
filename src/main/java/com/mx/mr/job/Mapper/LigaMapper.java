package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.mx.mr.job.Dto.LigaDto;

public class LigaMapper <T> implements RowMapper<LigaDto>{
	@Override
	public LigaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		LigaDto liga = new LigaDto();
		liga.setIdLiga(rs.getLong("ID LIGA"));
		liga.setNombreLiga(rs.getString("NOMBRE"));
		liga.setFechaRegistro(rs.getDate("FECHA DE REGISTRO"));
		return liga;
	}
}
