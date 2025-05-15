package com.mx.mr.job.Repository;

import java.util.List;


import com.mx.mr.job.Dto.EstadisticaJugadorDto;

public interface EstadisticaJugadorRepository {
	
	
	public List<EstadisticaJugadorDto> getJugadorByEquipo(EstadisticaJugadorDto equipo);

}
