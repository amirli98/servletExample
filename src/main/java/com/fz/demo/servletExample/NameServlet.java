package com.fz.demo.servletExample;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        response.setContentType("text/html");
        if (lastName == null || firstName == null) {
            response.getWriter().println("<p>Please provide your last name and first name...</p>");
        }
        else
            response.getWriter().printf("<p>Hello %s,%s</p>",lastName,firstName);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
