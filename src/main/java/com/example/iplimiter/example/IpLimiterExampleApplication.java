package com.example.iplimiter.example;

import com.van.limiter.core.annotation.EnableIpLimit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 在此处添加 EnableIpLimit 注解
 * @author Van
 */
@EnableIpLimit
@SpringBootApplication
public class IpLimiterExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpLimiterExampleApplication.class, args);
    }

}
