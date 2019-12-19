package controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebConfig implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		
		webCtx.register(ServletConfig.class);
		// loads the Servlet configuration class file for settings
		
		webCtx.setServletContext(ctx);
		ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(webCtx));
		// Creates a new dispatcher servlet using a new servlet object
		
		servlet.setLoadOnStartup(1);
		// sets the dispatcher servlet to load on startup
		
		servlet.addMapping("/");
		// servlet will deal with URL mappings that have "/"
		
		
		
		
	}
	
	

	
}
