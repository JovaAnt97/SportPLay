package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.EquipoDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Repository.EquipoRepository;
import com.mx.mr.job.Service.EquipoService;

@Service
public class EquipoServiceImpl implements EquipoService{
	@Autowired
	private EquipoRepository equipoRepository;

	@Override
	public ResponseDto getEquipo() {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<EquipoDto> equipo = equipoRepository.getEquipo();

			if (equipo != null && equipo.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("Equipo obtenido");
				respuesta.setContent(equipo);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("Equipo no obtenido");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar el equipo ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}


}
