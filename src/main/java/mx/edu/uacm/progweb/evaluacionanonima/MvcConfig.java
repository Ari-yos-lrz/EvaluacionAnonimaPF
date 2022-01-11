package mx.edu.uacm.progweb.evaluacionanonima;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/catalogoAdmin").setViewName("adminCatalogo");
		registry.addViewController("/creaActivity").setViewName("creaActividad");
		registry.addViewController("/inicioSesion").setViewName("login");
		registry.addViewController("/registrarse").setViewName("registro");
		/*registry.addViewController("/admiInicio").setViewName("inicioAdmi");
		registry.addViewController("/inicioUser").setViewName("inicioUsuario");*/
		registry.addViewController("/agregarActivity").setViewName("agregarActividad");
		registry.addViewController("/respuestaActivity").setViewName("respuestaActividad");
		registry.addViewController("/revisionActivity").setViewName("revisionActividad");
	}
}
