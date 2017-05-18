package br.com.projetoloja.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.projetoloja.controllers.HomeController;
import br.com.projetoloja.dao.PedidoDao;
import br.com.projetoloja.modelo.Pedido;
import br.com.projetoloja.services.ServicesController;

@EnableWebMvc
@ComponentScan(basePackageClasses = { HomeController.class, Pedido.class, PedidoDao.class,ServicesController.class })
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public FormattingConversionService mcvConversionService() {
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
		DateFormatterRegistrar formatterRegistrar = new DateFormatterRegistrar();
		formatterRegistrar.setFormatter(new DateFormatter("dd/MM/yyyy"));
		formatterRegistrar.registerFormatters(conversionService);

		return conversionService;

	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	/*@Override
	public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
	    configurer.parameterName("mediaType")
	            .defaultContentType(MediaType.APPLICATION_JSON)
	            .mediaType("xml", MediaType.APPLICATION_XML)
	            .mediaType("json", MediaType.APPLICATION_JSON_VALUE);
	}*/
}
