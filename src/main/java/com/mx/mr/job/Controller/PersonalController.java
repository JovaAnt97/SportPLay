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

import com.mx.mr.job.Dto.PersonalDto;
import com.mx.mr.job.Dto.ResponseDto;

@Controller
@RequestMapping("api/personal")
public class PersonalController {
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getPersonal", method=RequestMethod.GET,produces="application/json")
	public ResponseDto nombrePersonal() {
		ResponseDto respuesta = new ResponseDto();
		
		List<PersonalDto> listaPersonal = new ArrayList<>();
		
		PersonalDto personal = new PersonalDto();
		personal.setNombrePersonal("Miguel");
		personal.setFechaRegistro(new Date());

		
		listaPersonal.add(personal);
		
		respuesta.setCode(0);
		respuesta.setMessage("Jugadores encontrados: ");
		respuesta.setContent(listaPersonal);
		
		return respuesta;
	}
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertPersonal", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertPersonal(@RequestBody PersonalDto nuevoPersonal) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Personal insertado");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}

}
