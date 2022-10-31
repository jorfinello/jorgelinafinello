
package com.porfolio.jor.Security.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint{
    private final static Logger logger = (Logger) LoggerFactory.getLogger(JwtEntryPoint.class);
}
