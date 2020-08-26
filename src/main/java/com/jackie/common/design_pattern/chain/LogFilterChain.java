package com.jackie.common.design_pattern.chain;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Jackie Wu
 * Created on 2020-07-30
 */
// 对请求与响应进行log
public class LogFilterChain implements FilterChain {
    private FilterChain nextFilter;

    public LogFilterChain(FilterChain nextFilter) {
        this.nextFilter = nextFilter;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        logRequest(request);
        logResponse(response);
        if (nextFilter != null) {
            // 转发给下一个 Filter
            nextFilter.doFilter(request, response);
        }
    }

    private void logRequest(ServletRequest request) {
        //  记录请求
    }

    private void logResponse(ServletResponse response) {
        // 记录响应
    }
}
