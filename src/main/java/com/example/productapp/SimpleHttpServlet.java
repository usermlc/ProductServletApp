
package com.example.productapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/simpleHttp")
public class SimpleHttpServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession(true);
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 1;
        } else {
            counter++;
        }
        session.setAttribute("counter", counter);

        out.println("<html><body>");
        out.println("<h1>Request Information</h1>");
        out.println("Context Path: " + request.getContextPath() + "<br>");
        out.println("Servlet Path: " + request.getServletPath() + "<br>");
        out.println("Path Info: " + request.getPathInfo() + "<br>");
        out.println("Query String: " + request.getQueryString() + "<br>");
        out.println("Counter: " + counter + "<br>");
        out.println("</body></html>");
    }
}
