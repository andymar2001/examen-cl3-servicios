/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.UserService;

/**
 *
 * @author Andy
 */
public class Controlador extends HttpServlet {

    String add = "anadir.jsp";
    String edit = "actualizar.jsp";
    String index = "index.jsp";
    String acceso = "";
    UserService user = new UserService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        if (accion.equals("add")) {
            acceso = add;
        } else if (accion.equals("Agregar")) {
            String firstName = request.getParameter("txtFirstName");
            String lastName = request.getParameter("txtLastName");
            String phone = request.getParameter("txtPhone");
            String email = request.getParameter("txtEmail");
            user.agregar(firstName, lastName, phone, email);
            acceso = index;
        } else if (accion.equals("editar")) {
            acceso = edit;
            request.setAttribute("iduser", request.getParameter("id"));
        } else if (accion.equals("Actualizar")) {
            String firstName = request.getParameter("txtFirstName");
            String lastName = request.getParameter("txtLastName");
            String phone = request.getParameter("txtPhone");
            String email = request.getParameter("txtEmail");
            int id = Integer.parseInt(request.getParameter("txtId"));
            user.actualizar(id, firstName, lastName, phone, email);
            acceso = index;
        } else if (accion.equals("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            user.eliminar(id);
            acceso = index;
        } else {
            acceso = index;
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
        dispatcher.forward(request, response);

    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
