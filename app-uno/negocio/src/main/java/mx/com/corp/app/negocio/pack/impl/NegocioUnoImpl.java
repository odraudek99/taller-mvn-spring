package mx.com.corp.app.negocio.pack.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.corp.app.negocio.pack.NegocioUno;
import mx.com.corp.jar.pack.BeanJar;

@Service
public class NegocioUnoImpl implements NegocioUno {

	@Autowired
	BeanJar beanJar;
	
	
	@Override
	public String saluda(String nombre) {
		
		if (nombre == null || nombre.isEmpty()) {
			return "Hola tú";
		}
		return "Hola "+nombre;
	}

	@Override
	public String saludaDos(String nombre) {
		return beanJar.saludaJar(nombre);
	}

}
