/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture09;

/**
 *
 * @author phuzeron
 */
public class Item{
    private String name;
    private int value;
    
    public Item(String name, int value){
        this.name = name;
        this.value = value;
    }
    
    public String getName(){
        return name;
    }
    
    public int getValue(){
        return value;
    }
}
