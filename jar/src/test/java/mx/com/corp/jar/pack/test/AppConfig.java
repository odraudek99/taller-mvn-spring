package mx.com.corp.jar.pack.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"mx.com.corp.app.negocio.pack"})
public class AppConfig {
}