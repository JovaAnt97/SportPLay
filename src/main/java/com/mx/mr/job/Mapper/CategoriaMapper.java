package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mr.job.Dto.CategoriaDto;

public class CategoriaMapper <T> implements RowMapper<CategoriaDto>{
	@Override
	public CategoriaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		CategoriaDto categoria = new CategoriaDto();
		categoria.setIdCategoria(rs.getLong("ID CATEGORIA"));
		categoria.setNombreCategoria(rs.getString("NOMBRE"));
		categoria.setRangoInicial(rs.getInt("RANGO INICIAL"));
		categoria.setRangoFinal(rs.getInt("RANGO FINAL"));
		categoria.setFechaRegistro(rs.getDate("FECHA DE REGISTRO"));
		return categoria;
	}


}
