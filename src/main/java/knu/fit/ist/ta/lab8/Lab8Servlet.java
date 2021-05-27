/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import knu.fit.ist.ta.lab5.Searching;
import knu.fit.ist.ta.lab5.Sorting;

/**
 *
 * @author Mark
 */
@WebServlet(name = "Lab8Servlet", urlPatterns = {"/lab8"})
public class Lab8Servlet extends HttpServlet {

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
        int t1 = Integer.parseInt(request.getParameter("task1"));
        if (t1 <= 0) {
            request.setAttribute("unsortedList", "Please enter a value more than zero");
            request.setAttribute("sortedList_2", "N/A");
            request.setAttribute("elapsedTime_2", "N/A");
            request.setAttribute("sortedList_3", "N/A");
            request.setAttribute("elapsedTime_3", "N/A");
        } else {
            Sorting list = new Sorting(t1);
            request.setAttribute("unsortedList", list.getUnsortedList());
            request.setAttribute("sortedList_2", list.sortApproach2());
            request.setAttribute("elapsedTime_2", list.time1);
            request.setAttribute("sortedList_3", list.sortApproach3());
            request.setAttribute("elapsedTime_3", list.time2);
        }
        request.getRequestDispatcher("lab8.jsp").forward(request, response);
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
