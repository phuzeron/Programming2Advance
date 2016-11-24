/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai08;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author phuzeron
 */
public class Information{   
    private Map map = new HashMap();
    
    public Information(String name, String gender,  String user,  String pass1,  String pass2,  String year,  String month, String day){
        map.put("name", name);
        map.put("gender", gender);
        map.put("user", user);
        map.put("pass1", pass1);
        map.put("pass2", pass2);
        map.put("year", year);
        map.put("month", month);
        map.put("day", day);
    }
    
    public String getName(){
        return map.get("name").toString();
    }
    
    public String getGender(){
        return map.get("gender").toString();
    }
    
    public String getUser(){
        return map.get("user").toString();
    }
    
    public String getPass1(){
        return map.get("pass1").toString();
    }
    
    public String getPass2(){
        return map.get("pass2").toString();
    }
    
    public String getYear(){
        return map.get("year").toString();
    }
    
    public String getMonth(){
        return map.get("month").toString();
    }
    
    public String getDay(){
        return map.get("day").toString();
    }
}
