package com.mx.mr.job.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.mr.job.Dto.EquipoDto;
import com.mx.mr.job.Dto.ResponseDto;

@Controller
@RequestMapping("api/equipos") 
public class EquipoController {
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getEquipos", method=RequestMethod.GET,produces="application/json")
	public ResponseDto nombreEquipo() {
		ResponseDto respuesta = new ResponseDto();
		
		List<EquipoDto> listaEquipos = new ArrayList<>();
		
		EquipoDto equipo = new EquipoDto();
		equipo.setNombreEquipo("Union Iguala");
		equipo.setFechaRegistro(new Date());

		
		listaEquipos.add(equipo);
		
		respuesta.setCode(0);
		respuesta.setMessage("Jugadores encontrados: ");
		respuesta.setContent(listaEquipos);
		
		return respuesta;
	}
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertEquipo", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertEquipo(@RequestBody EquipoDto nuevoEquipo) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Equipo insertado");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}
}
