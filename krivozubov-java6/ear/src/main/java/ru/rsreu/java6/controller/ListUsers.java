package ru.rsreu.java6.controller;

import ru.rsreu.java6.users.Users;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListUsers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        Users users = (Users)servletContext.getAttribute("users");
        req.setAttribute("users", users.getUsers());
        req.setAttribute("login", req.getSession().getServletContext().getAttribute("user"));
        this.getServletContext().getRequestDispatcher("/users.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().getServletContext().setAttribute("user", null);
        resp.sendRedirect("/");
    }
}
