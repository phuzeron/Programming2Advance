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
public class Ex22{
    public static void main(String[] args){
        Tweet tweet = new Tweet();
        BufferedReader br = null;
        
        try{
            br = new BufferedReader(new FileReader(new File("./src/kougi02/tweet2.csv")));
            
            String line;
            while((line = br.readLine()) != null){
                String[] word = line.split(",");
                tweet.setNo(Integer.parseInt(word[0]));
                tweet.setTID(word[1]);
                tweet.setName(word[2]);
                tweet.setTime(word[3]);
                tweet.setText(word[4]);
                tweet.printTweet();
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
