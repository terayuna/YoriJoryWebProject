package com.yorijory.webprj.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class YojoSuccessHandler implements AuthenticationSuccessHandler{
   @Override
   public void onAuthenticationSuccess(
         HttpServletRequest request, 
         HttpServletResponse response, 
         Authentication authentication)
         throws IOException, ServletException {
      System.out.println("±Â¶ß");
      response.sendRedirect("/JSPProjectYun/customer/notice");
   }
   
}