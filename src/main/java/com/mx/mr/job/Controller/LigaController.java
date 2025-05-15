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

import com.mx.mr.job.Dto.LigaDto;
import com.mx.mr.job.Dto.ResponseDto;

@Controller
@RequestMapping("api/liga")
public class LigaController {
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getLiga", method=RequestMethod.GET,produces="application/json")
	public ResponseDto nombreLiga() {
		ResponseDto respuesta = new ResponseDto();
		
		List<LigaDto> listaLiga = new ArrayList<>();
		
		LigaDto liga = new LigaDto();
		liga.setNombreLiga("Ruben Figueroa");
		liga.setFechaRegistro(new Date());

		
		listaLiga.add(liga);
		
		respuesta.setCode(0);
		respuesta.setMessage("Jugadores encontrados: ");
		respuesta.setContent(listaLiga);
		
		return respuesta;
	}
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertLiga", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertLiga(@RequestBody LigaDto nuevoLiga) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Jugador insertado");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}

}
