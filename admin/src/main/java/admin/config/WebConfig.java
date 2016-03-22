package admin.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("admin.web") //在指定包路径下搜索controller
public class WebConfig extends WebMvcConfigurerAdapter {
  
  @Autowired
  EntityManagerFactory entityManagerFactory;
  
  //配置JSP view resolver
  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    resolver.setExposeContextBeansAsAttributes(true);
    return resolver;
  }

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    //让DispatcherServlet将静态资源的请求转发到容器的默认servlet
    configurer.enable();
  }
  
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
   OpenEntityManagerInViewInterceptor interceptor = new OpenEntityManagerInViewInterceptor();
   interceptor.setEntityManagerFactory(entityManagerFactory);
   registry.addWebRequestInterceptor(interceptor);
  }
}
