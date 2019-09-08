package cn.johnyu.initailizer;

import cn.johnyu.app.conf.AppConfig;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;

/**
 * 较为传统方式的AnnotationConfigWebApplicationContext的启动方式
 */
public class MyWebApplicationInitializer
//    implements WebApplicationInitializer
{
//    @Override
    public void onStartup(ServletContext servletCxt) {
        // Load Spring web application configuration
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        //自定义的配置类，与SpringFramework的结合点
        ac.register(AppConfig.class);
        ac.refresh();

        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);

        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");

        Filter filter=new CharacterEncodingFilter("UTF-8");


    }
}