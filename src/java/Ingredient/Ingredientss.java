/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Ingredient;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rafiu
 */
public class Ingredientss extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        
        Ingredient ingredientss = new Ingredient("Onion", "Two Cups", 1, 1);
        
        
        ingredients.add(ingredientss);
        ingredients.add(new Ingredient("Cilantro", "half Cups", 1, 1));
        ingredients.add(new Ingredient("Potatoes", "One Cups", 1, 1));
        ingredients.add(new Ingredient("Tomatoes", "Two Cups", 1, 1));
        ingredients.add(new Ingredient("Green Chilli", "One Fourth Cup", 1, 1));
        ingredients.add(new Ingredient("Tomato", "Two Cups", 1, 1));
        ingredients.add(new Ingredient("SHAN BIRYANI MASALA", "ONE", 1, 1));
        ingredients.add(new Ingredient("Whloe Black Peppers", "three Pieces", 1, 1));
        ingredients.add(new Ingredient("Bay Leaf", "three Pieces", 1, 1));
        ingredients.add(new Ingredient("Cloves", "three Pieces", 1, 1));
        ingredients.add(new Ingredient("Cardammon", "three Pieces", 1, 1));
        ingredients.add(new Ingredient("Youghurt", "Two Cups", 1, 1));
        ingredients.add(new Ingredient("Rice", "Three Cups", 1, 1));
        ingredients.add(new Ingredient("Chicken", "Four Cups", 1, 1));
        ingredients.add(new Ingredient("Clarified Butter", "One Cup", 1, 1));
        ingredients.add(new Ingredient("Olive", "One and a Half Cup", 1, 1));
        ingredients.add(new Ingredient("Water", "Six Cups", 1, 1));
        
        request.setAttribute("ingredients",ingredients);
        
        
       String url = "/ingredients.jsp";
       
       getServletContext().getRequestDispatcher(url).forward(request, response); 
       
       
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
