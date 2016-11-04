package mx.com.corp.app.negocio.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import mx.com.corp.app.negocio.pack.NegocioUno;
import mx.com.corp.app.negocio.pack.impl.NegocioUnoImpl;
import mx.com.corp.jar.pack.impl.BeanJarImpl;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:test/spring-test.xml"})
@ContextConfiguration(locations={"classpath:test/*.xml","classpath*:/META-INF/spring-config/*.xml"})
//@ContextConfiguration(classes = {AppConfig.class})
public class TestNegocio {
	
	@Autowired
	NegocioUno negocioUno;
	
	@Test
    public void test1() {
        Assert.isInstanceOf(NegocioUnoImpl.class, negocioUno);
        String resp = negocioUno.saluda("eduardo");
        Assert.isTrue("Hola eduardo".equals(resp));
        
    }

	@Test
    public void test2() {
        String resp = negocioUno.saludaDos("eduardo");
        Assert.isTrue("Hola eduardo Saludando desde jar".equals(resp));

    }
	

}
