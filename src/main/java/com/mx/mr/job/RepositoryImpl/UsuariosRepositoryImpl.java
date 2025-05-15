package com.mx.mr.job.RepositoryImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mr.job.Dto.EquipoDto;
import com.mx.mr.job.Dto.UsuarioDto;
import com.mx.mr.job.Mapper.UsuariosMapper;
import com.mx.mr.job.Repository.UsuariosRepository;


@Repository
public class UsuariosRepositoryImpl implements UsuariosRepository {
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	@Override
	public List<UsuarioDto> getUsuarios(EquipoDto equipo) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT U.NOMBRE AS NOMBRE_USUARIO , E.NOMBRE AS NOMBRE_EQUIPO FROM USUARIO U INNER JOIN JUGADOR J ON U.ID_USUARIO = J.ID_USUARIO\r\n" + 
				" INNER JOIN EQUIPO E ON E.ID_EQUIPO  = J.ID_EQUIPO\r\n" + 
				" WHERE E.NOMBRE = ?", new Object[] {equipo.getNombreEquipo()},
				new UsuariosMapper<UsuarioDto>());
	}


	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
