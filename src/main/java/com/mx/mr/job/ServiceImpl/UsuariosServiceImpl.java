package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.EquipoDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Dto.UsuarioDto;
import com.mx.mr.job.Repository.UsuariosRepository;
import com.mx.mr.job.Service.UsuariosService;

//aqui van a ir las reglas de negocio 
@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;

	@Override //sobre escrito
	public ResponseDto getUsuarios(EquipoDto equipo) {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<UsuarioDto> usuarios = usuariosRepository.getUsuarios(equipo);

			if (usuarios != null && usuarios.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("usuarios obtenidos");
				respuesta.setContent(usuarios);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("usuarios no obtenidos");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar los usuarios ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}


}
