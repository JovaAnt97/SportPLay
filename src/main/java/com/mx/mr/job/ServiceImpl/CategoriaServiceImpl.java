package com.mx.mr.job.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mr.job.Dto.CategoriaDto;
import com.mx.mr.job.Dto.ResponseDto;
import com.mx.mr.job.Repository.CategoriaRepository;
import com.mx.mr.job.Service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public ResponseDto getCategoria() {
		ResponseDto respuesta = new ResponseDto();

		try {
			List<CategoriaDto> categoria = categoriaRepository.getCategoria();

			if (categoria != null && categoria.size() > 0) {
				respuesta.setCode(0);
				respuesta.setMessage("Categoria obtenida");
				respuesta.setContent(categoria);
			} else {
				respuesta.setCode(-1);
				respuesta.setMessage("Categoria no obtenida");

			}
		} catch (Exception e) {
			respuesta.setCode(500);
			respuesta.setMessage("Error al consultar la categoria ");
			System.out.println("Exception ocurrida "+e.getMessage());
		}

		return respuesta;
	}

}
