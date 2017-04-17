package flf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;


@SpringBootApplication
@ServletComponentScan	//这个注解在有listener,filter,servlet时候必要
public class Application {
	
	/**
	 * 如果不加@ServletComponentScan
	 * 用以下@bean的方式配置，可以比较灵活
	 * @param args
	 */
//    @Bean
//    public ServletRegistrationBean indexServletRegistration() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(new IndexServlet());
//        registration.addUrlMappings("/hello");
//        return registration;
//    }
//
//    @Bean
//    public FilterRegistrationBean indexFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean(new IndexFilter());
//        registration.addUrlPatterns("/");
//        return registration;	
//    }
//    @Bean
//    public RedisPublicModel initRedisPublicModel(){
//    	//获取BeanFactory
//    	DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory)ctx.getAutowireCapableBeanFactory();
//    	
//    	RedisPublicModel redisPublicModel = new RedisPublicModel();
//    	redisPublicModel.setRedisTemplate(defaultListableBeanFactory.getBean(""));
//        return redisPublicModel;
//    }
	
	public static void main(String[] args) {
		//直接启动
//		SpringApplication.run(Application.class, args);
		
		//传入参数启动
        SpringApplication application = new SpringApplication(Application.class);
        //监听器在spring容器开始前做准备
//        application.addListeners(new ApplicationListenerEnvironmentPrepared());
        application.run(args);
	}
}

