package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.LigaDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Repository.LigaRepository;
import com.mx.mr.job.Service.LigaService;

@Service
public class LigaServiceImpl implements LigaService{
	@Autowired
	private LigaRepository ligaRepository;

	@Override
	public ResponseDto getLiga() {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<LigaDto> liga = ligaRepository.getLiga();

			if (liga != null && liga.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("Liga obtenida");
				respuesta.setContent(liga);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("Liga no obtenida");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar la Liga ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}


}
