package com.hao.microservice.Controller;

import com.hao.microservice.Config.EnvConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Muggle Lee
 * @Date: 2019/1/8 14:19
 */

@RestController
public class EnvController {

//    @Value("${env}")
//    private String env;
//
//
//    @GetMapping("/print")
//    public String print(){
//        return env;
//    }

    @Autowired
    private EnvConfig envConfig;

    @GetMapping("/env/print")
    public String print(){
        return "name: " + envConfig.getName();
    }

}
