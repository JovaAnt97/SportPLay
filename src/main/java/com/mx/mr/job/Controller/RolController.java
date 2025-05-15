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

import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Dto.RolDto;

@Controller
@RequestMapping("api/rol")
public class RolController {
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getRol", method=RequestMethod.GET,produces="application/json")
	public ResponseDto nombreRol() {
		ResponseDto respuesta = new ResponseDto();
		
		List<RolDto> listaRol = new ArrayList<>();
		
		RolDto rol = new RolDto();
		rol.setNombre("Jugador");
		rol.setFechaRegistro(new Date());

		
		listaRol.add(rol);
		
		respuesta.setCode(0);
		respuesta.setMessage("Roles encontrados: ");
		respuesta.setContent(listaRol);
		
		return respuesta;
	}
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertRol", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertRol(@RequestBody RolDto nuevoRol) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Rol insertado");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}
}
