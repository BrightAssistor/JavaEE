package com.bristor.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class TestJettyHandler extends AbstractHandler  {

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub

		System.out.println(target);
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        PrintWriter out = response.getWriter();
        if(target.equals("/favicon.ico")) {
            System.out.println("1");
            out.println("404");
        } else {
            System.out.println("2");
            out.print("<h3>hello jetty!</h3>");
            if(request.getParameter("name") != null) {
                out.print(request.getParameter("name"));;

            }
        }
//        request.getRequestDispatcher("index.html").forward(request, response);
//        response.sendRedirect("index.html");
    }

}
