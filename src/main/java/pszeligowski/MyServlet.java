package pszeligowski;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet("/") - mam komunikacje w xml wiec moge usunąć adnotacje
public class MyServlet extends HttpServlet {

    //server ma odpiwedziec na get


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        PrintWriter out = resp.getWriter();
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");

        out.println("Hello World - Servlet1");
        //Redirect
//        resp.sendRedirect(req.getContextPath() + "/hello2");
        //Forward
//        getServletContext().getRequestDispatcher("/hello2").forward(req, resp);
        //include
        //getServletContext().getRequestDispatcher("/hello2").include(req, resp);

        //Ciasteczko
        Cookie cookie = new Cookie("CookieNew", "CookieValue");
        resp.addCookie(cookie);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        PrintWriter out = resp.getWriter();

        out.println("Hello World, pozdrawiam wszystkich Polaków");
    }
}
