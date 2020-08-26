package com.jackie.common.design_pattern.chain;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jackie Wu
 * Created on 2020-07-30
 */
public class WarningFilterChain implements FilterChain {
    private FilterChain nextFilter;

    public WarningFilterChain(FilterChain nextFilter) {
        this.nextFilter = nextFilter;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        if (httpServletResponse.getStatus() != 200) {
            // 响应失败，发送报警
            sendAlarm("请求失败了！");
        }
        if (nextFilter != null) {
            // 转发给下一个 Filter
            nextFilter.doFilter(request, response);
        }
    }
    private void sendAlarm(String msg) {

    }
}
