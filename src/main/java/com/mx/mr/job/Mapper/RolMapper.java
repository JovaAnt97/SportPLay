package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mr.job.Dto.RolDto;

public class RolMapper <T> implements RowMapper<RolDto>{
	@Override
	public RolDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		RolDto rol = new RolDto();
		rol.setIdRol(rs.getLong("ID CATEGORIA"));
		rol.setNombre(rs.getString("NOMBRE"));
		rol.setDescripcion(rs.getString("DESCRIPCION"));
		rol.setFechaRegistro(rs.getDate("FECHA DE REGISTRO"));
		return rol;
	}
}
