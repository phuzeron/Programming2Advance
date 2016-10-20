/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work02;


/**
 *
 * @author phuzeron
 */
public class Animal{
    private int number;
    private String name, kanaName, englishName;
    
    public void setNumber(int n){
        this.number = n;
    }
      
    public void setName(String name){
        this.name = name;
    }
    
    public void setKanaName(String name){
        this.kanaName = name;
    }
    
    public void setEnglishName(String name){
        this.englishName = name;
    }
    
    public void printAnimal(){
        System.out.println(number + ". " + name + "(" + kanaName + ") : " + englishName);
    }
            
}
