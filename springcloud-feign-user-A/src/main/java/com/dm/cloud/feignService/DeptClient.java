package com.dm.cloud.feignService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "springcloud-feign-dept", fallback = HystrixFeignFallback.class, configuration = MFeignConfig.class)
public interface DeptClient {

	@GetMapping(value = "/feignDept/deptList")
	public String deptList();
}
