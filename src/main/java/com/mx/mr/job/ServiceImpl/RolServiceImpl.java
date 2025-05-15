package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Dto.RolDto;
import com.mx.mr.job.Repository.RolRepository;
import com.mx.mr.job.Service.RolService;

@Service
public class RolServiceImpl implements RolService{
	@Autowired
	private RolRepository rolRepository;

	@Override
	public ResponseDto getRol() {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<RolDto> rol = rolRepository.getRol();

			if (rol != null && rol.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("Rol obtenido");
				respuesta.setContent(rol);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("Rol no obtenido");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar El rol ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}
}
