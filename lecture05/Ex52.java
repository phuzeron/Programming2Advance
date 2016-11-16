/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture05;

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
public class Ex52{
    private static ResultSet rs;
    private static Statement stmt;
    private static Connection con;

    public static void main(String[] args){

        try{
            String driverUrl = "jdbc:derby://localhost:1527/meibo";
            con = DriverManager.getConnection(driverUrl, "db", "db");
            stmt = con.createStatement();
            String sql = "insert into T_STUDENT (STUDENT_ID, FULLNAME, GAKUBU_ID, GRADE, SCORE) values (?, ?, ?, ?, ?)";
            int count = stmt.executeUpdate(sql);
            System.out.println(count + "件のレコードを追加しました");
            }catch(SQLException ex){
            Logger.getLogger(Ex52.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                rs.close();
                stmt.close();
                con.close();
            }catch(SQLException ex){
                Logger.getLogger(Ex52.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
