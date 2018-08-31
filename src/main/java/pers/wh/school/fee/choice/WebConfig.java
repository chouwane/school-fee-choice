package pers.wh.school.fee.choice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pers.wh.school.fee.choice.interceptor.AuthorizeInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        AuthorizeInterceptor interceptor = new AuthorizeInterceptor();

        interceptor.setApplicationContext(applicationContext);
        registry.addInterceptor(interceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/js/**", "/style/**")
        ;

    }

}
