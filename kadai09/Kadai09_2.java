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

/**
 *
 * @author phuzeron
 */
@WebServlet(name = "Kadai09_2", urlPatterns = {"/kadai09/Kadai09_2"})
public class Kadai09_2 extends HttpServlet{

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
            out.println("<title>Servlet Kadai09_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Kadai09_2 at " + request.getContextPath() + "</h1>");
            
            Tweet[] tweets = new Tweet[3];
            tweets[0] = new Tweet(1, "abc", "佐藤太郎", "2016/08/09 10:56", "つかれた");
            tweets[1] = new Tweet(2, "123", "鈴木花", "2016/08/18 21:18", "やったね！");
            tweets[2] = new Tweet(3, "jkl", "高橋一馬", "2016/09/02 22:43", "なにしてる？");
            
            out.println("<hr>");
            out.println(tweets[0].toString().replaceAll("\\n", "<br>"));
            out.println("<hr>");
            out.println(tweets[1].toString().replaceAll("\\n", "<br>"));
            out.println("<hr>");
            out.println(tweets[2].toString().replaceAll("\\n", "<br>"));
            
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
