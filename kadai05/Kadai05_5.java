/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuzeron
 */
public class Kadai05_5{

    public static void main(String[] args){
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        
        try{
            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(c.getTime());
            System.out.println("現在の日付:" + date);
            
            String driverUrl = "jdbc:derby://localhost:1527/shop";
            con = DriverManager.getConnection(driverUrl, "db", "db");
            stmt = con.createStatement();
            String sql = "SELECT * FROM T_ITEM where EXPIRATION <= '" + date + "'";
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                StringBuilder sb = new StringBuilder();
                sb.append(rs.getInt("ITEM_ID"));
                sb.append(",");
                sb.append(rs.getString("ITEMNAME"));
                sb.append(",");
                sb.append(rs.getInt("PRICE"));
                sb.append(",");
                sb.append(rs.getInt("STOCK"));
                sb.append(",");
                sb.append(rs.getDate("EXPIRATION"));
                System.out.println(sb);
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Kadai05_5.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                rs.close();
                stmt.close();
                con.close();
            }catch(SQLException ex){
                Logger.getLogger(Kadai05_5.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
