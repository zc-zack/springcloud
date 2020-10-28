package com.zack.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * com.zack.springcloud.config
 *
 * @author zhangc
 * @version 1.0
 * @create 2020/10/27 16:50
 */
@Configuration
public class BeanConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
