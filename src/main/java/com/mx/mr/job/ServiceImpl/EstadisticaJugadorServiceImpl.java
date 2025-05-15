package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.EstadisticaJugadorDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Repository.EstadisticaJugadorRepository;
import com.mx.mr.job.Service.EstadisticaJugadorService;

@Service
public class EstadisticaJugadorServiceImpl implements EstadisticaJugadorService {
	
	@Autowired
	private EstadisticaJugadorRepository estadisticaJugadorRepository;

	@Override
	public ResponseDto getJugadorByEquipo(EstadisticaJugadorDto equipo) {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<EstadisticaJugadorDto> estadisticaJugador = estadisticaJugadorRepository.getJugadorByEquipo(equipo);

			if (estadisticaJugador != null && estadisticaJugador.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("EstadisticaJugador obtenida");
				respuesta.setContent(estadisticaJugador);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("EstadisticaJugador no obtenida");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar la estadistica del Jugador ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}

}
