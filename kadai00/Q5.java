/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work00;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuzeron
 */
public class Q5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        List<String> alist = new ArrayList<>();
        String str1 = "Apple";
        String str2 = "Orange";
        alist.add(str1);
        alist.add(str2);
        for(String a : alist){
            System.out.println(a);
        }
    }
    
}
