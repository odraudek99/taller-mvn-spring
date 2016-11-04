package mx.com.corp.app.web;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import mx.com.corp.app.negocio.pack.NegocioUno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@ManagedBean(name = "principalController")
@Controller
public class PrincipalController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired//@ManagedProperty(value = "#{negocioUno}")
	NegocioUno negocioUno;

	private String texto;
	private String saludo;

	@PostConstruct
	public void init() {
		texto = "hola";
	}

	public String testMB(String nombre) {
		return "test mb "+nombre;
	}
	
	public String testMB2(String nombre) {
		return negocioUno.saluda(nombre);
	}
	
	public void saluda() {
		this.saludo =negocioUno.saluda(texto);
	}
	
	public void saludaDos() {
		this.saludo =negocioUno.saludaDos(texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public NegocioUno getNegocioUno() {
		return negocioUno;
	}

	public void setNegocioUno(NegocioUno negocioUno) {
		this.negocioUno = negocioUno;
	}
	
	

}
