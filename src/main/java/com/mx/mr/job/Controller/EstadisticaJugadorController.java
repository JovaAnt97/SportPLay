package com.mx.mr.job.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.mx.mr.job.Dto.EstadisticaJugadorDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Service.EstadisticaJugadorService;
@Controller
@RequestMapping("api/estadisticaJugador")
public class EstadisticaJugadorController {
	
	
	@Autowired 
	private EstadisticaJugadorService estadisticaJugadorService;
	
	
	
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getJugadorByEquipo", method=RequestMethod.POST,produces="application/json")
	public ResponseDto getJugadorByEquipo(@RequestBody EstadisticaJugadorDto equipo) {
		ResponseDto respuesta = new ResponseDto();
		   respuesta = estadisticaJugadorService.getJugadorByEquipo(equipo);
		return respuesta;
	}
	
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getJugadorByPartido", method=RequestMethod.POST,produces="application/json")
	public ResponseDto getJugadorByPartido(@RequestBody EstadisticaJugadorDto equipo) {
		ResponseDto respuesta = new ResponseDto();
		   respuesta = estadisticaJugadorService.getJugadorByEquipo(equipo);
		return respuesta;
	}
	
	
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertEjugador", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertJugador(@RequestBody EstadisticaJugadorDto nuevoJugador) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Estadistica del jugador insertado");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}

}
