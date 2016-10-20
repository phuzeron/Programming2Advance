/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture02;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author phuzeron
 */
public class Ex21{
    public static void main(String[] args){
        BufferedReader br = null;
        
        try{
            br = new BufferedReader(new FileReader(new File("./src/kougi02/tweet.csv")));
            
            String line;
            while((line = br.readLine()) != null){
                String[] word = line.split(",");
                System.out.println("twitterID:" + word[0]);
                System.out.println("氏名:" + word[1]);
            }
        }catch(Exception ex){
            Logger.getLogger(Ex21.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                br.close();
            }catch(IOException ex){
                Logger.getLogger(Ex21.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
