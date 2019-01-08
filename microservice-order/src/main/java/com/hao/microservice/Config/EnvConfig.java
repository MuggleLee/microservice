package com.hao.microservice.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author Muggle Lee
 * @Date: 2019/1/8 14:24
 */
@Data
@RefreshScope
@Component
@ConfigurationProperties("demo")
public class EnvConfig {
    private String name;
}
