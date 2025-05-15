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

import com.mx.mr.job.Dto.EquipoDto;
import  com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Dto.UsuarioDto;
import com.mx.mr.job.Service.UsuariosService;

@Controller
@RequestMapping("api/usuarios") // PARA DAR NOMBRE A MI CONTROLADOR O SERVICIO 
public class UsuariosController {
	 
	@Autowired
	private UsuariosService usuariosService;
	
	
	// UN SERVICIO PUEDE SER DE DOS TIPOS
	//1.- PARA QUE TE REDIRECCIONE A UNA VISTA
	// 2.- PARA QUE TE DEVUELVA DATOS  -- ESTAMOS TRABAJAND CON ESTE
	
	//VAMOS A TENER SERVICIOS DE LOS SIGUIENTES TIPOS
	// GET UNICAMENTE RETORNA VALORES
	// POST RECIBE Y RETORNA VALORES
	// PUT RECIBE Y RETORNA UNA RESPUESTA, SIRVE PARA ACTUALIZAR REGISTROS
	// DELETE RECIBE Y RETORNA UNA RESPUESTA. SIORVE PARA ELIMINAR 
	
	//un json se forma apartir de valores, datos por ejemplo de una clases
	/*	
	 * 
	 * [
	 *  {
	     	"idTrabajador": 1
			"nombre" :  "Alexis"
			"edad" :  1
			"salarion": 12.12
		 	"fechaIngreso": "12/12/12"
		 },
		  {
	 *  	"idTrabajador": 1
			"nombre" :  "Alexis"
			"edad" :  1
			"salarion": 12.12
		 	"fechaIngreso": "12/12/12"
		 }
		 ]
	*/

	
	/* CODIGOS DE RESPUESTA HTTP
	 * 200 = PETICIÓN EXITOSA
	 * 202 = PETICIÓN REALIZADA CORRECTAMENTE
	 * 404 = NO SE ENCONTRO EL SERVICIO
	 * 500 = EXCEPCIÓN INTERNA (SE REVISA EN EL CODIGO)
	 * 503 = PERMISOS DENEGADOS (SE REVISA EN EL CODIGO)
	 * 404 = BAD REQUEST (PETICIÓN INCORRECTA) (QUIERE DECIR QUE TE EQUIVOCASTE EN EL FORMATO DE LA PETICIÓN, A LO MEJOR MANDASTE
	 * UNA PETICIÓN DE TIPO GET, CUANDO TU SERVICIO ES DE TIPO POST) 
	 */
	
	@ResponseBody //ESTA ANOTACION SIRVE PARA QUE EL SERVICIO SOLO DEVUELVA INFORMACIÓN
	@RequestMapping(value="/getUsuarioByName", method=RequestMethod.POST,produces="application/json")
	public ResponseDto nombreUsuario(@RequestBody EquipoDto equipo ) {
		ResponseDto respuesta = new ResponseDto();
		
	
		respuesta = usuariosService.getUsuarios(equipo);
		
		return respuesta;
	}
	
	//@RequestBody NOS SIRVE PARA RECIBIR UN OBJETO O VALOR EN FORMATO JSON
	// ESTE SERVICIO NOS PIDE UN OBJETO nuevoJugador DE TIPO JugadorDto y QUE SEA UN JSON
	//DEBIDO A RequestBody
	@ResponseBody  // NOS PERMITE RETORNAR UNICAMENTE VALORES
	@RequestMapping(value="/insertUsuario", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity < ResponseDto >  insertUsuario(@RequestBody UsuarioDto nuevoUsuario) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto respuesta = new ResponseDto();
		respuesta.setMessage("Usuario insertado");
		respuesta.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <ResponseDto> (respuesta, httpHeaders, HttpStatus.OK);	 //CODIGO 202
	}
	
}
