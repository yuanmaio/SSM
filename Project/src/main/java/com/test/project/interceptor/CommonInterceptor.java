package com.test.project.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/4/4.
 */
public class CommonInterceptor extends HandlerInterceptorAdapter {
    /**
     * 在业务处理器处理请求之前被调用
     * 如果返回false
     * 从当前拦截器往回执行所有拦截器的afterCompletion(),
     * 再退出拦截器
     * 如果返回true
     * 执行下一个拦截器,直到所有拦截器都执行完毕
     * 再执行被拦截的Controller
     * 然后进入拦截器链
     * 从最后一个拦截器往回执行所有的postHandle()
     * 接着再从最后一个拦截器往回执行所有的afterCompletion()
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("=================执行顺序:1 preHandle=================");
        String requestUri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String url = requestUri.substring(contextPath.length());
        System.out.println("requestUri-->" + requestUri);
        System.out.println("contextPath-->" + contextPath);
        System.out.println("url-->" + url);
        Object user = request.getSession().getAttribute("user");
        if (user == null) {
            System.out.println("user-->" + user);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return false;
        } else {
            return true;
        }
    }

    /**
     * 在业务处理器处理请求执行完成后,生成视图之前执行的动作
     * 可在modelAndView中加入数据,比如当前时间
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("==============执行顺序: 2、postHandle================");
        if (modelAndView != null) {
            modelAndView.addObject("var", "测试postHandle");
        }
    }

    /**
     * 在DispatcherServlet完全处理请求后被调用,可用于清理资源等
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有拦截器的afterCompletion
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(ex.toString()+"Exception");
        System.out.println("==============执行顺序: 3、afterCompletion================");
    }
}

