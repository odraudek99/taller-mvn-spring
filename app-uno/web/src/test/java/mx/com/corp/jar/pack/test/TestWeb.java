package mx.com.corp.jar.pack.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import mx.com.corp.app.negocio.pack.NegocioUno;
import mx.com.corp.app.web.PrincipalController;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:test/spring-test.xml"})
@ContextConfiguration(locations={"classpath:test/*.xml","classpath*:/META-INF/spring-config/*.xml"})
//@ContextConfiguration(classes = {AppConfig.class})
public class TestWeb {
	
	
	PrincipalController principalController;
	
	@Autowired//@ManagedProperty(value = "#{negocioUno}")
	NegocioUno negocioUno;
	
	 @Before
	    public void setup() {
	        principalController = new PrincipalController();
	        principalController.setNegocioUno(negocioUno);
	    }
	 
	
	@Test
    public void test1() {
        String resp = principalController.testMB("eduardo");
        Assert.isTrue("test mb eduardo".equals(resp));
    }

	@Test
    public void test2() {
        String resp = principalController.testMB2("eduardo");
        Assert.isTrue("Hola eduardo".equals(resp));
    }

}
