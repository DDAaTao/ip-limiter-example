package com.example.iplimiter.example.handler;


import com.van.limiter.core.exception.IpLimitException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 默认情况下,当请求超出限流限制时,会打印日志并抛出 IpLimitException 异常
 * 用户可以通过统一异常拦截器捕获并自定义业务处理
 * 后续考虑增加回调或钩子方法
 * */
@Slf4j
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(IpLimitException.class)
    @ResponseBody
    public String resolveCommonException(IpLimitException e) {
        log.error("IpLimitException Intercept. Please try again later.. " + e.getMessage());
        return "IpLimitException Intercept. Please try again later.. ";
    }

}
