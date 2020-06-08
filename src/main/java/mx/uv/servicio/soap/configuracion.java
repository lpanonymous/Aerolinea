package mx.uv.servicio.soap;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.core.io.ClassPathResource;

@EnableWs
@Configuration

public class configuracion {
	@Bean
	public XsdSchema aerolineaSchema() {
		return new SimpleXsdSchema(new ClassPathResource("nose.xsd"));
	}

	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) 
	{
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "aerolinea")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema aerolineaSchema) 
	{
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("aerolineaPort");
		wsdl11Definition.setLocationUri("/ws/aerolinea");
		wsdl11Definition.setTargetNamespace("http://www.example.org/nose");
		wsdl11Definition.setSchema(aerolineaSchema);
		return wsdl11Definition;
	}
}


