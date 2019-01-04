package com.hao.microservice.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Muggle Lee
 * @Date: 2019/1/4 14:23
 */
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/msg")
    String ProductMsg();

}
