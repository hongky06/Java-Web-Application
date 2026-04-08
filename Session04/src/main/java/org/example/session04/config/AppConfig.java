package org.example.session04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// đánh dấu lớp câí hình
@Configuration
// bật chế độ mvc
@EnableWebMvc
//Quét các bean đang cần được khởi tạo
@ComponentScan(basePackages = "org.example.session04")
public class AppConfig {
    // cấu hình bean viewResolver
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        // cấu hình tiền tố
        viewResolver.setPrefix("/WEB-INF/views/");
        // cấu hình hậu tố
        viewResolver.setSuffix(".jsp");
        return viewResolver;

    }
}
