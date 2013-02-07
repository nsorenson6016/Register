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
    private MenuItem [] mi;
    
    public receiptCalc(){}
    
    public String getTotalBill(MenuItem [] menuList){
        double bill = 0;
        double salesTax = bill * 0.055;
        double grandTotal = bill + salesTax;
     
        String receipt = "";
        
        for(MenuItem menuItem : menuList) {
            bill = bill + menuItem.getItemPrice();
            receipt = receipt + menuItem.getItemName() + " " 
                    + menuItem.getItemPrice() + "<cr>";
        }
        
        receipt = receipt + "Total bill: " + bill + "<cr>" 
                + "Sales Tax: " + salesTax + "<cr>"
                + "Total:" + grandTotal;
        
        return receipt;
    }
}
