package com.woniu.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.woniu.converter.DateConverter;

@Configuration
public class DateConfig {
	
	@Autowired
	private RequestMappingHandlerAdapter requestMappingHandlerAdapter;
	
	@PostConstruct
	public void addSelfConverter() {
		ConfigurableWebBindingInitializer initializer=(ConfigurableWebBindingInitializer) requestMappingHandlerAdapter.getWebBindingInitializer();
		if(initializer.getConversionService()!=null) {
			GenericConversionService genericConversionService = (GenericConversionService)initializer.getConversionService();
            //添加字符串转换为日期类型的字符串
            genericConversionService.addConverter(new DateConverter());
		}
	}
}
