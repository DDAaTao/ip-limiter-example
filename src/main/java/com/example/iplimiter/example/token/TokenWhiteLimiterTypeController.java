package com.example.iplimiter.example.token;

import com.van.limiter.core.annotation.IpLimit;
import com.van.limiter.core.enums.LimitType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author van
 */
@IpLimit(maxTimes = 2, limitType = LimitType.WHITE_LIST, whiteList="${my.white.list}")
@RestController
public class TokenWhiteLimiterTypeController {

    @GetMapping("/token/white/get1")
    public String getTest1() {
        return "get1";
    }

    @GetMapping("/token/white/get2")
    public String getTest2() {
        return "get2";
    }

    @GetMapping("/token/white/get3")
    public String getTest3() {
        return "get3";
    }

}
