package com.hao.microservice.Controller;

import com.hao.microservice.Client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Muggle Lee
 * @Date: 2019/1/4 14:24
 */
@RestController
@Slf4j
public class ClientController {

    @Autowired
    private ProductClient productClient;

//    @Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        String response = productClient.ProductMsg();
        log.info("response={}", response);


//        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort() + "/msg");
//        String response = restTemplate.getForObject(url,String.class);

//        String response = restTemplate.getForObject("http://PRODUCT/msg",String.class);
//        log.info("response={}",response);
        return response;
//        return null;
    }
}
