package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author panzhixiong
 * @date 2018/10/23
 */
public class DemoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("start request...");
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("post response");
        long startTime  = (long)request.getAttribute("startTime");
        long finishTime = System.currentTimeMillis();
        long spendTime = new Long(finishTime - startTime);
        System.out.println("spend time:" + spendTime + " ms");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("finish request");
        System.out.println("finish get startTime:" + request.getAttribute("startTime"));
        request.removeAttribute("startTime");
    }
}
