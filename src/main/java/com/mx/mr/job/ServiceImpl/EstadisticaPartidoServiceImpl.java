package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.EstadisticaPartidoDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Repository.EstadisticaPartidoRepository;
import com.mx.mr.job.Service.EstadisticaPartidoService;
@Service
public class EstadisticaPartidoServiceImpl implements EstadisticaPartidoService{
	@Autowired
	private EstadisticaPartidoRepository estadisticaPartidoRepository;

	@Override
	public ResponseDto getEstadisticaPartido() {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<EstadisticaPartidoDto> estadisticaPartido = estadisticaPartidoRepository.getEstadisticaPartido();

			if (estadisticaPartido != null && estadisticaPartido.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("Estadistica del Partido obtenida");
				respuesta.setContent(estadisticaPartido);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("Estadistica del Partido no obtenida");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar la Estadistica del Partido ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}


}
