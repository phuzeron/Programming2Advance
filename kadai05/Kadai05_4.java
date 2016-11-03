/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuzeron
 */
public class Kadai05_4{

    public static void main(String[] args){
        PreparedStatement ps = null;
        Connection con = null;
        BufferedReader br = null;     
        
        try{
            String driverUrl = "jdbc:derby://localhost:1527/shop";
            con = DriverManager.getConnection(driverUrl, "db", "db");
            String sql = "insert into T_ITEM (ITEMNAME, PRICE, STOCK, EXPIRATION) values (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);

            br = new BufferedReader(new FileReader(new File("./src/kadai05/item2.csv")));
            
            String line;
            while((line = br.readLine()) != null){
                String[] word = line.split(",");
                ps.setString(1, word[0]);
                ps.setInt(2, Integer.parseInt(word[1]));
                ps.setInt(3, Integer.parseInt(word[2]));
                Date date = Date.valueOf(word[3]);
                ps.setDate(4, date);
                
                int count = ps.executeUpdate();
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Kadai05_4.class.getName()).log(Level.SEVERE, null, ex);
        }catch(FileNotFoundException ex){
            Logger.getLogger(Kadai05_4.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Kadai05_4.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                ps.close();
                con.close();
            }catch(SQLException ex){
                Logger.getLogger(Kadai05_4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
