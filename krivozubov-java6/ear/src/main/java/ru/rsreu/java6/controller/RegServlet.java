package ru.rsreu.java6.controller;

import ru.rsreu.java6.users.User;
import ru.rsreu.java6.users.Users;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        if (servletContext.getAttribute("users") == null) {
            servletContext.setAttribute("users", new Users());
        }
        if (request.getSession().getServletContext().getAttribute("user") == null) {
            this.getServletContext().getRequestDispatcher("/reg.jsp").forward(request, response);
        } else {
            response.sendRedirect("/users");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        Users users = (Users) servletContext.getAttribute("users");
        req.setCharacterEncoding("UTF-8");
        req.getSession().getServletContext().setAttribute("user", req.getParameter("name"));
        users.getUsers().add(new User(req.getParameter("name")));
        resp.sendRedirect("/");
    }
}
