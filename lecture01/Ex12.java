/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuzeron
 */
public class Ex12{
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileWriter fw = null;
         
        try{
            br = new BufferedReader(new FileReader(new File("./src/kougi01/test.txt")));
            fw= new FileWriter("./src/kougi01/out.txt");
            bw = new BufferedWriter(fw);
            
            String line = null;
            while((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            
        }catch(FileNotFoundException ex){
            Logger.getLogger(Ex12.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Ex12.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NullPointerException ex){
            Logger.getLogger(Ex12.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception ex){
            Logger.getLogger(Ex12.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            br.close();
            bw.close();
            fw.close();
        }
        
        
    }
}
