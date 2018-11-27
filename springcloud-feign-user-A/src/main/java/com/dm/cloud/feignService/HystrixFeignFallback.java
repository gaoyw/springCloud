package com.dm.cloud.feignService;

import org.springframework.stereotype.Component;

@Component
public class HystrixFeignFallback implements DeptClient {

	@Override
	public String deptList() {
		return "deptList服务无法连接";
	}
}
