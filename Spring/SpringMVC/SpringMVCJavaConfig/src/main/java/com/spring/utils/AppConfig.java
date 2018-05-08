package com.spring.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages="com.spring.demo")
@Configuration
public class AppConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public InternalResourceViewResolver getIRVR() {		
		System.out.println("Setting ip spring InternalResourceViewResolver");	
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("WEB-INF/jsp/");
		irvr.setSuffix(".jsp");
		return irvr;
		
	}
	
	//MVC resource tag
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//super.addResourceHandlers(registry);
		System.out.println("Setting up resources");
		registry.addResourceHandler("/myResources/**").addResourceLocations("/resources/");
	}
	

}
