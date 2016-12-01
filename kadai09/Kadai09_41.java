/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai09;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author phuzeron
 */
@WebServlet(name = "Kadai09_41", urlPatterns = {"/kadai09/Kadai09_41"})
public class Kadai09_41 extends HttpServlet{

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
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Kadai09_41</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Kadai09_41 at " + request.getContextPath() + "</h1>");

            HttpSession session = request.getSession(false);
            if(session == null){
                out.println("<p>初回訪問</p>");
                session = request.getSession(true);
                session.setAttribute("visited", "1");
            }else{
                String visitedStr = (String) session.getAttribute("visited");
                int visited = Integer.parseInt(visitedStr);
                visited++;

                out.println("<p>訪問回数は" + visited + "回目です</p>");
                session.setAttribute("visited", Integer.toString(visited));
            }
            out.println("<p><a href=\"Kadai09_41\">再表示</a></p><p><a href=\"Kadai09_42\">セッションの破棄</a></p>");

            out.println("</body>");
            out.println("</html>");
        }
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
            throws ServletException, IOException{
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
            throws ServletException, IOException{
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo(){
        return "Short description";
    }// </editor-fold>

}
