package org.acme.greeting.extension;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class GreetingExtensionServlet extends HttpServlet { 

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException { 
        resp.getWriter().write("Hello");
    }
}