package com.example.iplimiter.example.window;

import com.van.limiter.core.annotation.IpLimit;
import com.van.limiter.core.enums.LimitType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 纯黑名单模式
 * @author van
 */
@IpLimit(maxTimes = 2, limitType = LimitType.BLACK_LIST, whiteList="${my.blacklist}")
@RestController
public class BlackLimiterTypeController {

    @GetMapping("/black/get1")
    public String getTest1() {
        return "get1";
    }

    @GetMapping("/black/get2")
    public String getTest2() {
        return "get2";
    }

    @GetMapping("/black/get3")
    public String getTest3() {
        return "get3";
    }

}
