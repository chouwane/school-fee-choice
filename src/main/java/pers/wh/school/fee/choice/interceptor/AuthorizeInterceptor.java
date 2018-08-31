package pers.wh.school.fee.choice.interceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.util.WebUtils;
import pers.wh.school.fee.choice.entity.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthorizeInterceptor implements HandlerInterceptor {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        HttpSession session = request.getSession();
        Student user = (Student) session.getAttribute("student");
        if(user == null){
            if(isAjaxRequest(request)){
                response.sendError(403, "尚未登录");
            }else{
                response.sendRedirect("/login");
            }
            return false;
        }
        return true;
    }

    /**
     * isAjaxRequest:判断请求是否为Ajax请求. <br/>
     *
     * @param request 请求对象
     * @return boolean
     */
    private boolean isAjaxRequest(HttpServletRequest request){
        String header = request.getHeader("X-Requested-With");
        boolean isAjax = "XMLHttpRequest".equals(header) ? true:false;
        return isAjax;
    }

}
