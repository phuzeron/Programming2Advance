/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai09;

/**
 *
 * @author phuzeron
 */
public class Tweet{
    private int tweetNo;
    private String twitterID, name, tweetTime, text;

    public Tweet(int tweetNo, String twitterID, String name, String tweetTime, String text){
        this.tweetNo = tweetNo;
        this.twitterID = twitterID;
        this.name = name;
        this.tweetTime = tweetTime;
        this.text = text;
    }
    
    @Override
    public String toString(){
        return tweetNo + ":" + twitterID + "(" + name + ")\n" + tweetTime + "\n" + text + "\n";
    }
}
