
package edu.poly.shopp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import edu.poly.shopp.interceptor.AdminAuthenticationInterceptor;





@Configuration
public class ConfigInterceptor implements WebMvcConfigurer{
@Autowired
private AdminAuthenticationInterceptor authenticationInterceptor;






 @Override
 public void addInterceptors(InterceptorRegistry registry) {
	
	 registry.addInterceptor(authenticationInterceptor)
		.addPathPatterns("/admin/**")
	   .addPathPatterns("/login", "/register1");
	 
 }

}


