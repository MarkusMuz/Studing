/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mark
 */
@WebServlet(name = "Lab7Servlet", urlPatterns = {"/lab7"})
public class Lab7Servlet extends HttpServlet {

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
        Tree tree = new Tree();
        Tree tree_balanced = new Tree();

        int i = 0;
        int n = 8;
        int[] array = new int[8];
        int[] arrayTree = new int[8];

        array[0] = Integer.parseInt(request.getParameter("1"));
        array[1] = Integer.parseInt(request.getParameter("2"));
        array[2] = Integer.parseInt(request.getParameter("3"));
        array[3] = Integer.parseInt(request.getParameter("4"));
        array[4] = Integer.parseInt(request.getParameter("5"));
        array[5] = Integer.parseInt(request.getParameter("6"));
        array[6] = Integer.parseInt(request.getParameter("7"));
        array[7] = Integer.parseInt(request.getParameter("8"));

        arrayTree = tree_balanced.sortTree(array);

        while (i < n) {
            tree_balanced.add(arrayTree[i]);
            i++;
        }

        tree.add(Integer.parseInt(request.getParameter("1")));
        tree.add(Integer.parseInt(request.getParameter("2")));
        tree.add(Integer.parseInt(request.getParameter("3")));
        tree.add(Integer.parseInt(request.getParameter("4")));
        tree.add(Integer.parseInt(request.getParameter("5")));
        tree.add(Integer.parseInt(request.getParameter("6")));
        tree.add(Integer.parseInt(request.getParameter("7")));
        tree.add(Integer.parseInt(request.getParameter("8")));

        tree.traverseInOrder(tree.root);
        tree.traversePreOrder(tree.root);
        tree.traversePostOrder(tree.root);
        tree.traverseLevelOrder(tree.root);
        tree_balanced.traverseLevelOrder(tree_balanced.root);

        request.setAttribute("inOrder", tree.inOrder);
        request.setAttribute("PreOrder", tree.PreOrder);
        request.setAttribute("PostOrder", tree.PostOrder);
        request.setAttribute("LevelOrder", tree.LevelOrder);
        request.setAttribute("Balanced", tree_balanced.LevelOrder);

        request.getRequestDispatcher("lab7.jsp").forward(request, response);
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
