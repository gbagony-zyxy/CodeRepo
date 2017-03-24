package org.ruyin.code.spring.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ruyin on 2017/3/24.
 *
 * 不直接实现HandlerInterceptor接口而是继承WebContentInterceptor是因为WebContentInterceptor提供了拦截方法的虚方法,对于不需要实现的拦截处理则不做处理
 */
public class WebRequestInterceptor extends WebContentInterceptor{

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("___________________________________postHandle processed_________________________________");
    }
}
