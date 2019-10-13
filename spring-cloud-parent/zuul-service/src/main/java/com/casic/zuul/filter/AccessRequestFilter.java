package com.casic.zuul.filter;
/*
 *Created with IntelliJ IDEA
 *User: tangcb
 *Date: 2019/10/13
 *Time: 18:02
 *Description:
 */

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Component
public class AccessRequestFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext cxt = RequestContext.getCurrentContext();
        Long startTime = (Long) cxt.get("startTime");
        Long duration = System.currentTimeMillis() - startTime;
        HttpServletRequest request = cxt.getRequest();
        String uri = request.getRequestURI();
        log.info("uri: {} , duration: {}", uri,duration);
        return null;
    }
}

