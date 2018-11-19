package com.luv2code.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

//	web.xml
	/*
	 * <servlet> <servlet-name>dispatcher</servlet-name> <servlet-class>
	 * org.springframework.web.servlet.DispatcherServlet </servlet-class>
	 * <init-param> <param-name>contextConfigLocation</param-name>
	 * <param-value>/WEB-INF/spring/dispatcher-config.xml</param-value>
	 * </init-param> <load-on-startup>1</load-on-startup> </servlet>
	 * 
	 * <servlet-mapping> <servlet-name>dispatcher</servlet-name>
	 * <url-pattern>/</url-pattern> </servlet-mapping>
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { DemoAppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
