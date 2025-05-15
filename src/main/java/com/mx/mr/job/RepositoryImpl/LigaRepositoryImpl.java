package com.mx.mr.job.RepositoryImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mr.job.Dto.LigaDto;
import com.mx.mr.job.Mapper.LigaMapper;
import com.mx.mr.job.Repository.LigaRepository;

@Repository
public class LigaRepositoryImpl implements LigaRepository{
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	@Override
	public List<LigaDto> getLiga() {
		jdbcTemplate.setDataSource(getDataSource());//PRIMERO SE ASGINA LA CONEXION PARA QUE 
		//EL JDBC TEMPLATE SEPA A QUE BASE DE DATOS DIRIGIRSE
		return jdbcTemplate.query("SELECT * FROM LIGA", 
				new LigaMapper<LigaDto>());
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
