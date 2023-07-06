package com.example.iplimiter.example.token;

import com.siiri.limiter.core.annotation.IpLimit;
import com.siiri.limiter.core.enums.CurrentLimiterType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 走默认限流策略,不考虑黑白名单参数
 * 默认 maxTimes - 单位时间内最多请求次数为10,为了演示效果,现改为 2
 * @author van
 */
@IpLimit(maxTimes = 2, currentLimiter = CurrentLimiterType.TOKEN_BUCKET)
@RestController
public class TokenDefaultLimiterTypeController {

    @GetMapping("/token/default/get1")
    public String getTest1() {
        return "get1";
    }

    @GetMapping("/token/default/get2")
    public String getTest2() {
        return "get2";
    }

    @GetMapping("/token/default/get3")
    public String getTest3() {
        return "get3";
    }

}
