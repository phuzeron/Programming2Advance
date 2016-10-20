/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work00;

/**
 *
 * @author phuzeron
 */
public class Item{
    private String name;
    private int value;

    public Item(String nm, int val){
        this.name = nm;
        this.value = val;
    }
    
    public String getName(){
        return  name;
    }
    
    public void setName(String nm){
        this.name = nm;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int val){
        this.value = val;
    }
}
