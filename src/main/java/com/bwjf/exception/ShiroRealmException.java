package com.bwjf.exception;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShiroRealmException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // 根据不同错误转向不同页面
        if(ex instanceof UnauthorizedException) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>异常");
            return new ModelAndView("error");
        }else {
            return new ModelAndView("error");
        }
    }
}
