package com.ciber.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciber.dao.IRespuestaDao;
import com.ciber.entities.RespuestaOpcion;
import com.ciber.entities.RespuestaTipo;
import com.ciber.service.IRespuestaService;

@Service
public class RespuestaServiceImpl implements IRespuestaService{
	
	@Autowired
	IRespuestaDao respuestaDao;

	@Override
	public List<RespuestaOpcion> obtenerRespuestasCuestionario(int codigo) {
		
		return respuestaDao.obtenerRespuestasCuestionario(codigo);
		
	}

	@Override
	public List<RespuestaTipo> obtenerRespuestaTipo() {
		
		return respuestaDao.obtenerRespuestaTipo();
		
	}

	@Override
	public int registrarRespuesta(RespuestaOpcion respuestaOpcion) {
		
		return respuestaDao.registrarRespuesta(respuestaOpcion);
		
	}

	@Override
	public int actualizarRespuesta(RespuestaOpcion respuestaOpcion) {
		
		return respuestaDao.actualizarRespuesta(respuestaOpcion);
		
	}

}
