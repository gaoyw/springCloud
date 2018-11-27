package com.dm.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient // 可以被Eureka服务端所发现
@EnableFeignClients // 调用其它服务api
// @EnableHystrix
@EnableCircuitBreaker // 启动断路器
@SpringBootApplication // @Configuration + @EnableAutoConfiguration + @ComponentScan
public class FeignDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignDeptApplication.class, args);
	}
}
