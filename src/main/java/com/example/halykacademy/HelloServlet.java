package com.example.halykacademy;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "registration", value = "/registration")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String position =request.getParameter("position");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><h1>" + name  +  position + "<h1><body>");
    }

    public void destroy() {
    }
}