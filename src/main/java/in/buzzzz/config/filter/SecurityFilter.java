package in.buzzzz.config.filter;

import in.buzzzz.util.constants.AppUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ekansh on 24/9/15.
 */
@Component
public class SecurityFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String appKey = ((HttpServletRequest)servletRequest).getHeader("Secret-Key");
        if(appKey!=null && appKey.equals(AppUtils.appKey))
            filterChain.doFilter(servletRequest, servletResponse);
        else{
            ((HttpServletResponse)servletResponse).sendError(HttpStatus.UNAUTHORIZED.value(),"UnAuthorized Access");
        }

    }

    @Override
    public void destroy() {

    }
}
