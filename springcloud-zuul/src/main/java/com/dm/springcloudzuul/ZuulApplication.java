package com.dm.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy // Zuul过滤器
@EnableEurekaClient // 可以被Eureka服务端所发现
@SpringBootApplication // @Configuration + @EnableAutoConfiguration + @ComponentScan
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
