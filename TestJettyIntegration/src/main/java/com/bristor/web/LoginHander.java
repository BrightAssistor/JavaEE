package com.bristor.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class LoginHander extends AbstractHandler {

	@Override
	public void handle(String target, Request baseReq, HttpServletRequest req, HttpServletResponse rsp)
			throws IOException, ServletException {
		req.setCharacterEncoding("utf-8");
		rsp.setContentType("text/html; charset=utf-8");
		rsp.setStatus(HttpServletResponse.SC_OK);
	    baseReq.setHandled(true);
	    PrintWriter out = rsp.getWriter();
        if(target.equals("/favicon.ico")) {
            System.out.println("login skip----------------------------------");
        } else if(target.equals("/")) {
            out.print(
            		"<!DOCTYPE html>                                                                     "
            		+"<html>                                                                              "
            		+"<head>                                                                              "
            		+"  <meta charset=\"utf-8\">                                                          "
            		+"  <title>首页</title>                                                               "
                    +"                                                                                    "
            		+"  <script type=\"text/javascript\">                                                 "
            		+"    // window.onload=function () {                                                  "
            		+"    //   var test = document.getElementById(\"conntype\");                          "
            		+"    //   alert(test);                                                               "
            		+"    // }                                                                            "
            		+"  </script>                                                                         "
            		+"</head>                                                                             "
            		+"<body>                                                                              "
            		+"  <div id=\"border\" style=\"height:800px;width:100%;\">                            "
            		+"    <form action=\"/query\" style=\"height:100%;width:100%;\">                      "
            		+"    <div style=\"height:5%;width:100%;margin-top: 1%\">                             "
            		+"      <span style=\"height:100%;width:10%;\">连接方式：</span>                      "
            		+"      <select id=\"conntype\" name=\"conntype\" style=\"height:100%;width:20%;\">   "
            		+"        <option value=\"http\">http</option>                                        "
            		+"        <option value=\"tcp\">tcp</option>                                          "
            		+"      </select>                                                                     "
            		+"    </div>                                                                          "
            		+"    <div style=\"height:5%;width:100%;margin-top: 2%\">                             "
            		+"      <span tyle=\"height:100%;width:10%;\">请求地址：</span>                       "
            		+"      <input id=\"url\" name=\"url\" style=\"height:100%;width:20%;\">              "
            		+"    </div>                                                                          "
            		+"    <div style=\"height:40%;width:100%;margin-top: 2%\">                            "
            		+"      <span tyle=\"height:100%;width:10%;\">请求报文：</span>                       "
            		+"      <textarea id=\"req\" name=\"req\" style=\"height:100%;width:70%;\"></textarea>"
            		+"    </div>                                                                          "
            		+"    <div style=\"height:40%;width:100%;margin-top: 2%\">                            "
            		+"      <span tyle=\"height:100%;width:10%;\">响应报文：</span>                       "
            		+"      <textarea id=\"rsp\" name=\"rsp\" style=\"height:100%;width:70%;\"></textarea>"
            		+"    </div>                                                                          "
            		+"    <div style=\"height:10%;width:100%;margin-top: 2%\">                            "
            		+"      <button type=\"submit\">发送</button>                                         "
            		+"    </div>                                                                          "
            		+"    </form>                                                                         "
            		+"  </div>                                                                            "
                    +"                                                                                    "
            		+"</body>                                                                             "
            		+"</html>                                                                             "
            		);
        }else {
            System.out.println("login undo----------------------------------");
		}
	}

}
