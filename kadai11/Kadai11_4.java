/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai11;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author phuzeron
 */
@WebServlet(name = "Kadai11_4", urlPatterns = {"/kadai11/Kadai11_4"})
public class Kadai11_4 extends HttpServlet{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");

        //コネクションとステートメントの宣言
        Connection con = null;
        Statement stmt = null;
        PreparedStatement ps = null;

        try(PrintWriter out = response.getWriter()){
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Kadai11_4</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Kadai11_4 at " + request.getContextPath() + "</h1>");

            request.setCharacterEncoding("UTF-8");

            //Class.forNameの記述
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //データベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/shop";
            con = DriverManager.getConnection(driverUrl, "db", "db");
            stmt = con.createStatement();

            // SQL文の取得とコミット
            String sqlInto = "insert into T_ITEM (ITEMNAME, PRICE, STOCK) values (?, ?, ?)";
            ps = con.prepareStatement(sqlInto);
            ps.setString(1, request.getParameter("name"));
            ps.setInt(2, Integer.parseInt(request.getParameter("price")));
            ps.setInt(3, Integer.parseInt(request.getParameter("stock")));

            int count = ps.executeUpdate();

            String sqlSelect = "select * from T_ITEM order by ITEM_ID desc";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            //Student型のArrayListを作成
            List<Item> itemList = new ArrayList<>();

            //データベースから値を取得して出力
            while(rs.next()){
                //1つのレコードの情報を格納するインスタンスを作成
                Item item = new Item(rs.getInt("ITEM_ID"), rs.getString("ITEMNAME"), rs.getInt("PRICE"), rs.getInt("STOCK"));

                //リストにインスタンスを追加
                itemList.add(item);
            }

            out.println("データベースに下記のデータ<br>");
            out.println(itemList.get(0).toStirng());
            out.println("を追加しました<br>");
            out.println("<a href=\"Kadai11_4.html\">戻る</a>");
            out.println("<hr>");

            //ResultSetのclose
            rs.close();

            //リストの内容を順番に出力
            for(Item i : itemList){
                out.println("ITEM_ID=" + i.getItemid() + "<br>");
                out.println("ITEMNAME=" + i.getItemname() + "<br>");
                out.println("PRICE=" + i.getPrice() + "<br>");
                out.println("STOCK=" + i.getStock() + "<hr>");
            }

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
        }

        if(ps != null){
            try{
                ps.close();
            }catch(SQLException e){
                throw new ServletException(e);
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
