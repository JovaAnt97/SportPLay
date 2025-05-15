package com.mx.mr.job.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mr.job.Dto.UsuarioDto;


public class UsuariosMapper <T> implements RowMapper<UsuarioDto> {
	@Override
	public UsuarioDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsuarioDto usuario = new UsuarioDto();
//		usuario.setIdUsuario(rs.getLong("ID USUARIO"));
//		usuario.setIdRol(rs.getLong("ID ROL"));
//		usuario.setNickname(rs.getString("NICKNAME"));
//		usuario.setEmail(rs.getString("EMAIL"));
//		usuario.setPassword(rs.getString("PASSWORD"));
//		usuario.setFotoJugador(rs.getString("FOTO"));
		usuario.setNombre(rs.getString("NOMBRE_USUARIO"));
//		usuario.setApellidoPaterno(rs.getString("APELLIDO PATERNO"));
//		usuario.setApellidoMaterno(rs.getString("APELLIDO MATERNO"));
//		usuario.setSexo(rs.getString("SEXO"));
//		usuario.setNombre(rs.getString("FECHA DE NACIMIENTO"));
//		usuario.setNombre(rs.getString("FECHA DE INGRESO"));
//		usuario.setNombre(rs.getString("FECHA DE REGISTRO"));
		return usuario;
	}
}
