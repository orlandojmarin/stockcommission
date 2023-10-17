/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stockcommission;
import java.util.Scanner;

/**
 *
 * @author orlandomarin
 */


public class StockCommission {

    public static void main(String[] args) 
    {       
    // define keyboard object
    Scanner keyboard = new Scanner(System.in);
    
    // variables based on user input
    double sharesPurchased; 
    double costPerShare;
    double commission;
    
    //variables based on calculations using user input
    double commissionRatio;
    double userCostCommission;
    double totalAmountPaid;
    double userCostSharesNoCommission;
    
    // ask user for number of shares purchased
    System.out.print("How many shares would you like to purchase? ");
    
    // read user's response
    sharesPurchased = keyboard.nextDouble();
    
    // ask user for the share price
    System.out.print("What is the price per share? ");
    
    // read user's response
    costPerShare = keyboard.nextDouble();
    
    // ask user what the commission percentage is
    System.out.print("What is the commission percentage? ");
    
    // read user's response
    commission = keyboard.nextDouble();
    
    // calculate commission ratio
    commissionRatio = commission / 100;
    
    // calculate the cost of the shares without commission
    userCostSharesNoCommission = sharesPurchased * costPerShare;
    
    // calculate the cost of the commission
    userCostCommission = userCostSharesNoCommission * commissionRatio;
    
    // calculate the total amount paid (shares plus commission)
    totalAmountPaid = userCostSharesNoCommission + userCostCommission;
    
    // print results
    System.out.println("The cost of the shares Orlando Marin purchased was $" 
            + userCostSharesNoCommission + " and the commission cost was $" 
            + userCostCommission + " for a total amount paid of $" + totalAmountPaid);
    
    }
}
