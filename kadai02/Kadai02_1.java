/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuzeron
 */
public class Kadai02_1{
    public static void main(String[] args){
        BufferedReader br = null;
        List<Animal> list = new ArrayList<>();
        
        try{
            br = new BufferedReader(new FileReader(new File("./src/work02/data21.csv")));

            String line;
            while((line = br.readLine()) != null){
                Animal animal = new Animal();
                String[] word = line.split(",");
                animal.setNumber(Integer.parseInt(word[0]));
                animal.setName(word[1]);
                animal.setKanaName(word[2]);
                animal.setEnglishName(word[3]);
                list.add(animal);
            }
        }catch(Exception ex){
            Logger.getLogger(Kadai02_1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                br.close();
            }catch(IOException ex){
                Logger.getLogger(Kadai02_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(Animal a : list){
            a.printAnimal();
        }
    }
}
