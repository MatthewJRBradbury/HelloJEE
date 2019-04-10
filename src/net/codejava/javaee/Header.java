package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

@WebServlet("/Header")
public class Header extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
      PrintWriter out = response.getWriter();
      out.print("<h1 style = 'margin-left:50%; margin-top:0%;'>Welcome to the MyDocs Portal - A safe way of sharing documents</h1>");
   }
}

