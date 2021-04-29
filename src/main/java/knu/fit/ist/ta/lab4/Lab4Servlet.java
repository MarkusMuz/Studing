/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mark
 */
@WebServlet(name = "Lab4Servlet", urlPatterns = {"/lab4"})
public class Lab4Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Lab2Calc ta = new Lab2Calc();
        
        String t2 = "" + ta.getList(ta.text).size();
        String t3 = "" + ta.getSet(ta.text).size();
        String t4 = "" + ta.Task4(ta.getList(ta.text), Integer.parseInt(request.getParameter("task4")), 1);
        String t5 = "" + ta.Task5(ta.text, request.getParameter("task5"));
        String t6 = "" + ta.Task6(ta.text, Integer.parseInt(request.getParameter("task6")));
        String t7 = "" + ta.Task7(ta.getList(ta.text), Integer.parseInt(request.getParameter("task7")));

        request.setAttribute("task2", t2);
        request.setAttribute("task3", t3);
        request.setAttribute("task4", t4);
        request.setAttribute("task5", t5);
        request.setAttribute("task6", t6);
        request.setAttribute("task7", t7);
        
        request.getRequestDispatcher("lab4.jsp").forward(request,response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
