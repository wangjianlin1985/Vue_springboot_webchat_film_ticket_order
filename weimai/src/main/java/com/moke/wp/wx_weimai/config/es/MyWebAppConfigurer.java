package com.moke.wp.wx_weimai.config.es;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/weimai/upFile/**").addResourceLocations("file:D:/定做区/2019-2020年定做/nodejs项目/1236基于Vue+Springboot电影购票小程序设计/wetapp/weimai/upFile/");
    }
}
