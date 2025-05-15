package com.mx.mr.job.Repository;

import java.util.List;

import com.mx.mr.job.Dto.EquipoDto;
import com.mx.mr.job.Dto.UsuarioDto;

public interface UsuariosRepository {
	public List<UsuarioDto> getUsuarios(EquipoDto equipo);
}
