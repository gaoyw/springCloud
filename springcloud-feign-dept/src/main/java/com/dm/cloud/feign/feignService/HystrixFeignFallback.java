package com.dm.cloud.feign.feignService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 调用user微服务断路器
 * 
 * @ClassName: HystrixFeignFallback
 * @author gaoy
 * @date 2018年11月19日 下午2:46:45
 */
@Component
public class HystrixFeignFallback implements UserClient {

	@Override
	public List<User> getUsers() {
		return new ArrayList<User>();
	}
}
