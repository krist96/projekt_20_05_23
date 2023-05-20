package com.example.projekt1;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "witaj", value = "/witaj")
public class Witaj extends HttpServlet {
    private String message;

    public void init() {
        message = "Cześć2!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Pobierz imię z formularza
        String imie = request.getParameter("imie");
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Pobierz imię z formularza
        String imie = request.getParameter("imie");

        //request.setAttribute("nameAttribute", imie); // Ustaw atrybut w żądaniu

        //request.getRequestDispatcher("index.jsp").forward(request, response);

        // Wyświetl imię w odpowiedzi
        PrintWriter out = response.getWriter();
        out.println("<h2>Witaj, " + imie + "!</h2>");

    }


    public void destroy() {
    }
}