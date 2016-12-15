/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai11;

/**
 *
 * @author phuzeron
 */
public class Human{
    private String name;
    private int age;
    
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getKind(){
        if(age < 6){
            return "乳幼児";
        }else if(age >= 6 && age < 12){
            return "こども";            
        }else if(age >= 12){
            return "おとな";
        }
        return null;
    }
}
