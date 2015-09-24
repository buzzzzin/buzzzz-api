package in.buzzzz.config.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by ekansh on 24/9/15.
 */
public class SecurityFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
