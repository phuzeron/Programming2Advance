/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture04;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuzeron
 */
public class Ex41{

    private static ResultSet rs;
    private static Statement stmt;
    private static Connection con;

    public static void main(String[] args){
        
        try{
            String driverUrl = "jdbc:derby://localhost:1527/meibo";
            con = DriverManager.getConnection(driverUrl, "db", "db");
            stmt = con.createStatement();
            String sql = "select * from T_STUDENT";
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                String result = "";
                result += rs.getInt("student_id") + ":";
                result += rs.getString("fullname");
                System.out.println(result);
            }
        }catch(SQLException ex){
            Logger.getLogger(Ex41.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                rs.close();
                stmt.close();
                con.close();
            }catch(SQLException ex){
                Logger.getLogger(Ex41.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
