/*package admin.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.WebApplicationInitializer;

public class AdminFilterInitializer implements WebApplicationInitializer{

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    javax.servlet.FilterRegistration.Dynamic filter =
    servletContext.addFilter("myFilter", OpenEntityManagerInViewFilter.class);
    filter.addMappingForUrlPatterns(null, false, "/*");
    filter.setInitParameter("entityManagerFactoryBeanName", "entityManagerFactory");
    filter.setInitParameter("flushMode", "AUTO");
  }

}*/
