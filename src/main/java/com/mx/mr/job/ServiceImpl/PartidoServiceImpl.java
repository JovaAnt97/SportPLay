package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.PartidoDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Repository.PartidoRepository;
import com.mx.mr.job.Service.PartidoService;

@Service
public class PartidoServiceImpl implements PartidoService{
	@Autowired
	private PartidoRepository partidoRepository;

	@Override
	public ResponseDto getPartido() {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<PartidoDto> partido = partidoRepository.getPartido();

			if (partido != null && partido.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("Partido obtenido");
				respuesta.setContent(partido);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("Partido no obtenido");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar el partido ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}

}
