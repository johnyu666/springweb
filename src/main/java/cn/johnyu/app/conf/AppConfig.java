package cn.johnyu.app.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"cn.johnyu.app.controller","cn.johnyu.app.conf"})
public class AppConfig {


}
