package mx.com.corp.jar.pack.impl;

import org.springframework.stereotype.Service;

import mx.com.corp.jar.pack.BeanJar;

@Service
public class BeanJarImpl implements BeanJar {

	@Override
	public String saludaJar(String nombre) {
		
		if (nombre == null || nombre.isEmpty()) {
			return "Hola tú, Saludando desde jar";
		}
		return "Hola "+nombre +" Saludando desde jar";
	}

}
