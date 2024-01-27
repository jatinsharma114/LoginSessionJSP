package com.springdemo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Configuration for the Dispatcher-Servlet 
 */
public class FrontControllerDS extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// web.xml file configuration for the Bean Here, Schema defined.  
		//@Configurationfile 
		System.out.println("Configuration and Component Scan ::::::::::::::::::::: ");
		return new Class[] {ConfigurationComponentScan.class};
	}

	@Override
	protected String[] getServletMappings() {
		// For all URL request coming fromm the Internet!! 
		System.out.println("Request coming from the Internet for every request ::::::::::::::::::::: ");
		return new String[] {"/"};
	}

}
