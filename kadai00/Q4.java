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
public class Q4{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String str;
        String input = "Hello, world";
        
        str = input.toUpperCase();
        System.out.println(str);
        
        str = input.substring(1, 5);
        System.out.println(str);
        
        String[] astr = input.split("o");
        
        for(int i = 0; i < astr.length; i++){
            System.out.println(astr[i]);
        }
    }
    
}
