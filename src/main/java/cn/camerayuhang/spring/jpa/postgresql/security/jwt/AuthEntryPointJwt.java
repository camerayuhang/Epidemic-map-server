/*
 * @Author: camerayuhang
 * @Date: 2022-12-03 22:06:13
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-04 22:02:40
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/security/jwt/AuthEntryPointJwt.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.security.jwt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint {

  private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

  @Override
  public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
      throws IOException, ServletException {
    logger.error("Unauthorized error: {}", authException.getMessage());
    // HttpServletResponse.SC_UNAUTHORIZED is the 401 Status code. It indicates that
    // the request requires HTTP authentication.
    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error: Unauthorized");
  }

}
