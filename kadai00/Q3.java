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
public class Q3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Item[] item;
        item = new Item[2];
        item[0] = new Item("apple", 200);
        item[1] = new Item("orange", 150);
        
        for(byte i = 0; i < item.length; i++){
            System.out.println(item[i].getName()+":"+item[i].getValue());
        }
    }
    
}
