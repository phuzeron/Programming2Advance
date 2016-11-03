/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuzeron
 */
public class Kadai05_2{
    
    public static void main(String[] args){
        PreparedStatement ps = null;
        Connection con = null;
        
        try{
            String driverUrl = "jdbc:derby://localhost:1527/shop";
            con = DriverManager.getConnection(driverUrl, "db", "db");
            String sql = "insert into T_ITEM (ITEMNAME, PRICE, STOCK) values (?, ?, ?)";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, "りんごヨーグルト");
            ps.setInt(2, 180);
            ps.setInt(3, 80);
            
            int count = ps.executeUpdate();

            }catch(SQLException ex){
            Logger.getLogger(Kadai05_2.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                ps.close();
                con.close();
            }catch(SQLException ex){
                Logger.getLogger(Kadai05_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
