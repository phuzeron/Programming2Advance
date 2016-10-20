/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author phuzeron
 */
public class Kadai01_2{

    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileWriter fw = null;
        int total = 0;
        String vegetable;

        try{
            br = new BufferedReader(new FileReader(new File("./src/en2/out11.txt")));
            fw = new FileWriter("./src/en2/out12.txt");
            bw = new BufferedWriter(fw);

            bw.write("野菜リスト：");
            String line = null;
            while((line = br.readLine()) != null){
                Pattern p = Pattern.compile("\\d");
                Matcher m = p.matcher(line);

                if(m.find()){
                    //値段
                    total = total + Integer.parseInt(line);
                }else{
                    //商品名
                    bw.write(line + "/");

                }

            }
            
            bw.write("\n");
            bw.write("合計の値段：" + total + "\n");
            bw.newLine();

        }catch(FileNotFoundException ex){
            Logger.getLogger(Kadai01_2.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Kadai01_2.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NullPointerException ex){
            Logger.getLogger(Kadai01_2.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception ex){
            Logger.getLogger(Kadai01_2.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            br.close();
            bw.close();
            fw.close();
        }
    }
}
