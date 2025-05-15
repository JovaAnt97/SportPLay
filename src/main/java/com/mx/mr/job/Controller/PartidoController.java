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

import com.mx.mr.job.Dto.PartidoDto;
import com.mx.mr.job.Dto.ResponseDto;

@Controller
@RequestMapping("api/partido")
public class PartidoController {
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getPartido", method=RequestMethod.GET,produces="application/json")
	public ResponseDto nombrePartido() {
		ResponseDto respuesta = new ResponseDto();
		
		List<PartidoDto> listaPartidos = new ArrayList<>();
		
		PartidoDto partido = new PartidoDto();
		partido.setCampo("Udaducla");
		partido.setFechaRegistro(new Date());

		
		listaPartidos.add(partido);
		
		respuesta.setCode(0);
		respuesta.setMessage("Partidos encontrados: ");
		respuesta.setContent(listaPartidos);
		
		return respuesta;
	}
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertPartido", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertPartido(@RequestBody PartidoDto nuevoPartido) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Partido insertado");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}

}
