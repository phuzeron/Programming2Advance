/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture01;

import java.io.File;

/**
 *
 * @author phuzeron
 */
public class Ex11{
    public static void main(String[] args){
        File file = new File("./src/kougi01/test.txt");
        
        System.out.println("File Name : " + file.getName());
        System.out.println("File Path : " + file.getAbsolutePath());
        System.out.println("File Size : " + file.length() + "byte");
    }
}
