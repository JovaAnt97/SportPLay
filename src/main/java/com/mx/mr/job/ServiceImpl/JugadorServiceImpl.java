package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.JugadorDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Repository.JugadorRepository;
import com.mx.mr.job.Service.JugadorService;

@Service
public class JugadorServiceImpl implements JugadorService{
	@Autowired
	private JugadorRepository jugadorRepository;

	@Override
	public ResponseDto getJugador() {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<JugadorDto> jugador = jugadorRepository.getJugador();

			if (jugador != null && jugador.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("Jugador obtenido");
				respuesta.setContent(jugador);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("Jugador no obtenido");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar el jugador ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}

}
