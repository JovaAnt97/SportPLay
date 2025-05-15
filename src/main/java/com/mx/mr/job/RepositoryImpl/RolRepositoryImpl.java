package com.mx.mr.job.RepositoryImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mr.job.Dto.RolDto;
import com.mx.mr.job.Mapper.RolMapper;
import com.mx.mr.job.Repository.RolRepository;

@Repository
public class RolRepositoryImpl implements RolRepository{
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	@Override
	public List<RolDto> getRol() {
		jdbcTemplate.setDataSource(getDataSource());//PRIMERO SE ASGINA LA CONEXION PARA QUE 
		//EL JDBC TEMPLATE SEPA A QUE BASE DE DATOS DIRIGIRSE
		return jdbcTemplate.query("SELECT * FROM ROL", 
				new RolMapper<RolDto>());
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
