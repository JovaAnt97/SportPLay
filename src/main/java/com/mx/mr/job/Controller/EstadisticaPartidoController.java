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

import com.mx.mr.job.Dto.EstadisticaPartidoDto;
import com.mx.mr.job.Dto.ResponseDto;

@Controller
@RequestMapping("api/epartido")
public class EstadisticaPartidoController {
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getEpartido", method=RequestMethod.GET,produces="application/json")
	public ResponseDto nombreEpartido() {
		ResponseDto respuesta = new ResponseDto();
		
		List<EstadisticaPartidoDto> listaEpartido = new ArrayList<>();
		
		EstadisticaPartidoDto epartido = new EstadisticaPartidoDto();
		epartido.setAsistencias(3);
		epartido.setFechaRegistro(new Date());

		
		listaEpartido.add(epartido);
		
		respuesta.setCode(0);
		respuesta.setMessage("Asistencias encontradas: ");
		respuesta.setContent(listaEpartido);
		
		return respuesta;
	}
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertEpartido", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertEpartido(@RequestBody EstadisticaPartidoDto nuevoEpartido) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Estadistica de partido insertada");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}

}
