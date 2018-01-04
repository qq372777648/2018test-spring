package net.lzw.springmvc;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {//1 tomcat启动 执行 onStartup

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		System.out.println("onStartup");
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();//2 启动 spring 容器
        ctx.register(MyMvcConfig.class);
        ctx.setServletContext(servletContext); 
        
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx)); //3 mvc 
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        servlet.setAsyncSupported(true);//1 异步支持
        
//		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//		rootContext.register(AppConfig.class);
//		servletContext.addListener(new ContextLoaderListener(rootContext));
//
//		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
//		webContext.register(WebConfig.class);
//		ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(webContext));
//		registration.setLoadOnStartup(1);
//		registration.addMapping("/");

	}

}
