package org.ruyin.code.spring.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ruyin on 2017/3/24.
 *
 * 不直接实现HandlerInterceptor接口而是继承WebContentInterceptor是因为WebContentInterceptor提供了拦截方法的虚方法,对于不需要实现的拦截处理则不做处理
 */
public class WebRequestInterceptor extends WebContentInterceptor{

    //决定使用哪一种Handler object
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException {
        request.setAttribute("status","getback");
        System.out.println("___________________________________preHandle processed_________________________________");
        return true;
    }

    //在将渲染结果映射到视图上之前适配器调用处理对象(handleradapter invoke handler object,before dispatcher render to views)
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("___________________________________postHandle processed_________________________________");
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
