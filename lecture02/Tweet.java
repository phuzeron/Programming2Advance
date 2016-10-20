/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture02;

/**
 *
 * @author phuzeron
 */
public class Tweet{
    private int tweetNo;
    private String twitterID, name, tweetTime, text;

    public Tweet(){
    }
    
    public void setNo(int tweetNo){
        this.tweetNo = tweetNo;
    }
    
    public void setTID(String tid){
        this.twitterID = tid;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setTime(String tweetTime){
        this.tweetTime = tweetTime;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public void printTweet(){
        System.out.println(tweetNo + ":" + twitterID + "(" + name + ")\n" + tweetTime + "\n" + text);
    }
}
