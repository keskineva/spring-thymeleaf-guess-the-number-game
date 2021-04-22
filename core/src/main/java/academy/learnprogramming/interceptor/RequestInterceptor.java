package academy.learnprogramming.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
public class RequestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response,
                             Object handler) throws Exception {
        log.debug("prehandle method called.  handler  {}", handler);
        log.debug("Url = {}", request.getRequestURL());
        return true;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        log.debug("posthandle method called.  handler  {}", handler);
        log.debug("Url = {}", request.getRequestURL());
        log.debug("model = {}", modelAndView.getModel());
        log.debug("view = {}", modelAndView.getView());

    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        log.debug("afterhandle method called.  handler  {}", handler);
        log.debug("Url = {}", request.getRequestURL());
    }
}
