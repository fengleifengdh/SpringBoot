package flf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:spring/application-bean.xml"})
public class MyOtherConfig {
	
}
