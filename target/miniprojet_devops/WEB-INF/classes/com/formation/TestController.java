package com.formation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/TestController")
public class TestController extends HttpServlet {
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	res.getWriter().print("<h1>Hello Word</h1>");
}
}
