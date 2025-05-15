package com.mx.mr.job.Service;

import com.mx.mr.job.Dto.EstadisticaJugadorDto;
import com.mx.mr.job.Dto.ResponseDto;

public interface EstadisticaJugadorService {
	
	ResponseDto getJugadorByEquipo(EstadisticaJugadorDto equipo);

}
