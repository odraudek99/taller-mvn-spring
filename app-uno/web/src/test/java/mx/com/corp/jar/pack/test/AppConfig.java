package mx.com.corp.jar.pack.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"mx.com.corp.jar.pack"})
public class AppConfig {
}