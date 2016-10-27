/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuzeron
 */
public class Kadai04_1{
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
                StringBuilder sb = new StringBuilder();
                sb.append(rs.getInt("STUDENT_ID"));
                sb.append(",");
                sb.append(rs.getString("FULLNAME"));
                sb.append(",");
                sb.append(rs.getInt("GAKUBU_ID"));
                sb.append(",");
                sb.append(rs.getInt("GRADE"));
                sb.append(",");
                sb.append(rs.getInt("SCORE"));
                System.out.println(sb.toString());
            }
        }catch(SQLException ex){
            Logger.getLogger(Kadai04_1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                rs.close();
                stmt.close();
                con.close();
            }catch(SQLException ex){
                Logger.getLogger(Kadai04_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
