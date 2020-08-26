package com.jackie.common.design_pattern.chain;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ChainPatternDemo {

    private static FilterChain getFilterChain() throws IOException, ServletException {
        FilterChain logFilterChain = new LogFilterChain(null);
        FilterChain warningFilterChain = new WarningFilterChain(logFilterChain);
        return warningFilterChain;
    }

    public static void main(String[] args) throws IOException, ServletException {
        FilterChain filterChain = getFilterChain();
        // 构造请求 与响应
        ServletRequest request = null;
        ServletResponse response = null;
        filterChain.doFilter(request, response);
    }
}