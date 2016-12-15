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
public class Item{
    private int item_id, price, stock;
    private String itemname;
    
    public Item(int item_id, String itemname, int price, int stock){
        this.item_id = item_id;
        this.itemname = itemname;
        this.price = price;
        this.stock = stock;
    }
    
    public int getItemid(){
        return item_id;
    }
    
    public String getItemname(){
        return itemname;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getStock(){
        return stock;
    }
    
    public String toStirng(){
        StringBuilder sb = new StringBuilder();
        sb.append("Item{");
        sb.append("item_id=").append(item_id).append(", ");
        sb.append("item_name=").append(itemname).append(", ");
        sb.append("price=").append(price).append(", ");
        sb.append("stock=").append(stock);
        sb.append("}");
        return sb.toString();
    }
}
