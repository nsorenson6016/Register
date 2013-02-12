/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Neal
 */
public class receiptCalc {
    
    public receiptCalc(){}
    
    public String getTotalBill(String [] menuList){
        double bill = 0;
        double salesTax = bill * 0.055;
        double grandTotal = bill + salesTax;
        String [] item;
        String foodItem;
        String itemPrice;
        String receipt = "";
        
        for(String menuItem : menuList) {
            // Makes the item into an array. Part 1 is the name. Part 2 is the price
            item = menuItem.split("/");
            foodItem = item[0];
            itemPrice = item[1];
            
            // Price gets added to the bill
            bill = bill + Double.valueOf(itemPrice);
            
            // add name and price to the receipt, with a line break
            receipt = receipt + foodItem + " " 
                    + itemPrice + "<br>";
        }
        
        receipt = receipt + "Total bill: " + bill + "<br>" 
                + "Sales Tax: " + salesTax + "<br>"
                + "Total:" + grandTotal;
        
        return receipt;
    }
}
