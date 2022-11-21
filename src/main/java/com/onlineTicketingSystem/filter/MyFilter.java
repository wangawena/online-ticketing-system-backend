package com.onlineTicketingSystem.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {

    //不需要过滤的路径
    String[] filterURI={"/api/login"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //获取访问路径
        String uri=((HttpServletRequest)servletRequest).getRequestURI();

        if(isURI(uri))
            filterChain.doFilter(servletRequest,servletResponse);
        else
        {
            String token=((HttpServletRequest)servletRequest).getHeader("Authorization");
            if(token!=null)
                filterChain.doFilter(servletRequest,servletResponse);
            else
            {
                String requestURI="/api/login";
                servletRequest.getRequestDispatcher(requestURI).forward(servletRequest,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }


    //判断是否直接放行
    public boolean isURI(String uri)
    {
        for(String s:filterURI)
        {
            if(s.compareTo(uri)==0)
                return true;
        }
        return false;
    }
}
