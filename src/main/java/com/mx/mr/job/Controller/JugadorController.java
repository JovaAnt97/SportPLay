package com.mx.mr.job.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.mr.job.Dto.JugadorDto;
import com.mx.mr.job.Dto.ResponseDto;

@Controller
@RequestMapping("api/jugadores")
public class JugadorController {
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getJugadores", method=RequestMethod.GET,produces="application/json")
	public ResponseDto nombreJugador() {
		ResponseDto respuesta = new ResponseDto();
		
		List<JugadorDto> listaJugadores = new ArrayList<>();
		
		JugadorDto jugador = new JugadorDto();
		jugador.setIdJugador(new Long(1));
		jugador.setFechaRegistro(new Date());

		
		listaJugadores.add(jugador);
		
		respuesta.setCode(0);
		respuesta.setMessage("Jugadores encontrados: ");
		respuesta.setContent(listaJugadores);
		
		return respuesta;
	}
}
