package com.mx.mr.job.RepositoryImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mr.job.Dto.EstadisticaJugadorDto;
import com.mx.mr.job.Mapper.EstadisticaJugadorMapper;
import com.mx.mr.job.Repository.EstadisticaJugadorRepository;

@Repository
public class EstadisticaJugadorRepositoryImpl implements EstadisticaJugadorRepository {
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	@Override
	public List<EstadisticaJugadorDto> getJugadorByEquipo( EstadisticaJugadorDto equipo) {
		jdbcTemplate.setDataSource(getDataSource());//PRIMERO SE ASGINA LA CONEXION PARA QUE 
		//EL JDBC TEMPLATE SEPA A QUE BASE DE DATOS DIRIGIRSE
	return jdbcTemplate.query("SELECT U.NOMBRE , E.NOMBRE, EJ.GOLES , EJ.ASISTENCIAS, EJ.TARJETAS_AMARILLAS , EJ.TARJETAS_ROJAS\r\n"+
				" FROM USUARIO U INNER JOIN JUGADOR J ON U.ID_USUARIO = J.ID_USUARIO\r\n" + 
				" INNER JOIN EQUIPO E ON E.ID_EQUIPO  = J.ID_EQUIPO\r\n" + 
				" INNER JOIN ESTADISTICAS_JUGADOR EJ ON EJ.ID_JUGADOR = J.ID_JUGADOR\r\n" + 
				" INNER JOIN ROL R ON R.ID_ROL =  U.ID_ROL\r\n" + 
				" WHERE E.NOMBRE = ? AND U.NOMBRE = ? AND U.ID_ROL = 1 ", new Object[] {equipo.getNombreEquipo(), equipo.getNombreUsuario()}, 
				new EstadisticaJugadorMapper<EstadisticaJugadorDto>());
	}

	
//	@Override
//	public List<EstadisticaJugadorDto> getJugadorByEquipo( EstadisticaJugadorDto equipo) {
//		jdbcTemplate.setDataSource(getDataSource());//PRIMERO SE ASGINA LA CONEXION PARA QUE 
//		//EL JDBC TEMPLATE SEPA A QUE BASE DE DATOS DIRIGIRSE
//	return jdbcTemplate.query("SELECT U.NOMBRE , E.NOMBRE, EJ.GOLES , EJ.ASISTENCIAS, EJ.TARJETAS_AMARILLAS , EJ.TARJETAS_ROJAS\r\n"+
//				" FROM USUARIO U INNER JOIN JUGADOR J ON U.ID_USUARIO = J.ID_USUARIO\r\n" + 
//				" INNER JOIN EQUIPO E ON E.ID_EQUIPO  = J.ID_EQUIPO\r\n" + 
//				" INNER JOIN ESTADISTICAS_JUGADOR EJ ON EJ.ID_JUGADOR = J.ID_JUGADOR\r\n" + 
//				" INNER JOIN ROL R ON R.ID_ROL =  U.ID_ROL\r\n" + 
//				" WHERE E.NOMBRE = ? AND U.NOMBRE = ? AND U.ID_ROL = 1 ", new Object[] {equipo.getNombreEquipo(), equipo.getNombreUsuario()}, 
//				new EstadisticaJugadorMapper<EstadisticaJugadorDto>());
//	}
	
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
