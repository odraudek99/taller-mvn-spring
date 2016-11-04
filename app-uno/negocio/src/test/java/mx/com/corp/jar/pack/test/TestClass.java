package mx.com.corp.jar.pack.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import mx.com.corp.jar.pack.BeanJar;
import mx.com.corp.jar.pack.impl.BeanJarImpl;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:test/spring-test.xml"})
@ContextConfiguration(classes = {AppConfig.class})
public class TestClass {
	
	@Autowired
	BeanJar beanJar;
	
	@Test
    public void test_ml_always_return_true() {

        Assert.isInstanceOf(BeanJarImpl.class, beanJar);
        String resp = beanJar.saludaJar("eduardo");
        Assert.isTrue("Hola eduardo Saludando desde jar".equals(resp));

    }

	

}
