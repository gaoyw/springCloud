package com.dm.cloud.feign.feignService;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 调用user微服务
 * 
 * @ClassName: UserClient
 * @author gaoy
 * @date 2018年11月19日 下午2:46:22
 */
@FeignClient(name = "springcloud-feign-user", fallback = HystrixFeignFallback.class, configuration = MFeignConfig.class)
public interface UserClient {

	@GetMapping(value = "/feignUser/userList")
	List<User> getUsers();
}
