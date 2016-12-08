/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai10;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author phuzeron
 */
@WebServlet(name = "Kadai10_3", urlPatterns = {"/kadai10/Kadai10_3"})
public class Kadai10_3 extends HttpServlet{

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
        
        //コネクションとステートメントの宣言
        Connection con = null;
        Statement stmt = null;
        PreparedStatement ps = null;
        
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Kadai10_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Kadai10_3 at " + request.getContextPath() + "</h1>");
            
            //Class.forNameの記述
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //データベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/shop";
            con = DriverManager.getConnection(driverUrl, "db", "db");
            stmt = con.createStatement();

            //文字コードの設定
            request.setCharacterEncoding("UTF-8");
            
            //SQL文の取得
            String sql2 = "insert into T_ITEM (ITEMNAME, PRICE, STOCK) values (?, ?, ?)";
            ps = con.prepareStatement(sql2);
            ps.setString(1, request.getParameter("itemname"));
            ps.setInt(2, Integer.parseInt(request.getParameter("price")));
            ps.setInt(3, Integer.parseInt(request.getParameter("stock")));
            
            int count = ps.executeUpdate();

            //SQL文の発行
            String sql = "select * from T_ITEM";
            ResultSet rs = stmt.executeQuery(sql);

            //データベースから値を取得して出力
            while(rs.next()){
                out.println("ITEM_ID = " + rs.getInt("ITEM_ID") + "<br>");
                out.println("ITEMNAME = " + rs.getString("ITEMNAME") + "<br>");
                out.println("PRICE = " + rs.getInt("PRICE") + "<br>");
                out.println("STOCK = " + rs.getInt("STOCK") + "<br>");
                out.println("EXPIRATION = " + rs.getDate("EXPIRATION") + "<br>");
                out.println("<hr>");
            }

            //ResultSetのclose
            rs.close();

            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
            //サーブレット内での例外をアプリケーションのエラーとして表示
            throw new ServletException(e);
        }finally{
            //例外が発生する・しないにかかわらず確実にデータベースから切断
            if(stmt != null){
                try{
                    stmt.close();
                }catch(SQLException e){
                    throw new ServletException(e);
                }
            }
            if(con != null){
                try{
                    con.close();
                }catch(SQLException e){
                    throw new ServletException(e);
                }
            }
            if(ps != null){
                try{
                    ps.close();
                }catch(SQLException e){
                    throw new ServletException(e);
                }
            }
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
