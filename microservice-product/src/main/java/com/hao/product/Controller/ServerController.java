package com.hao.product.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Muggle Lee
 * @Date: 2019/1/4 14:28
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "Hello World !";
    }

}
