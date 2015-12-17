package com.yorijory.webprj.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class YojoAuthFailHandler extends SimpleUrlAuthenticationFailureHandler {
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("틀려먹음");
		response.sendRedirect("/JSPProjectYun/joinus/login");

		/*request.setAttribute("error", "너는 틀려먹었음");
		request.getRequestDispatcher("/joinus/login").forward(request, response);*/

		// super.onAuthenticationFailure(request, response, exception);
	}
}
