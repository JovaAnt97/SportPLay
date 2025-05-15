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

import com.mx.mr.job.Dto.CategoriaDto;
import com.mx.mr.job.Dto.ResponseDto;

@Controller
@RequestMapping("api/categorias") // PARA DAR NOMBRE A MI CONTROLADOR O SERVICIO 

public class CategoriaController {
	
	
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getCategorias", method=RequestMethod.GET,produces="application/json")
	public ResponseDto nombreCategoria() {
		ResponseDto respuesta = new ResponseDto();
		
		List<CategoriaDto> listaCategorias = new ArrayList<>();
		
		CategoriaDto categoria = new CategoriaDto();
		categoria.setNombreCategoria("Juvenil A");
		categoria.setFechaRegistro(new Date());

		
		listaCategorias.add(categoria);
		
		respuesta.setCode(0);
		respuesta.setMessage("Categorias encontradas: ");
		respuesta.setContent(listaCategorias);
		
		return respuesta;
	}
	//@RequestBody NOS SIRVE PARA RECIBIR UN OBJETO O VALOR EN FORMATO JSON
		// ESTE SERVICIO NOS PIDE UN OBJETO nuevoJugador DE TIPO JugadorDto y QUE SEA UN JSON
		//DEBIDO A RequestBody
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertCategoria", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertCategoria(@RequestBody CategoriaDto nuevoCategoria) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Categoria insertada");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}

	
}


