package com.maiccol.holamundo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Necesitamos implementar una llave
@WebServlet("/holaServlet")
public class HolaServlet extends HttpServlet {

    @java.lang.Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");

    //Creo un objeto de tipo PrintWriter que nos permite escribir en el navegador
    //Sistem.out.print();
        PrintWriter out = resp.getWriter();
    //Genermaos el contenido de la respuesta
        //generamos el contenido de la respuesta
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HOLA MAICCOLSITO</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}

