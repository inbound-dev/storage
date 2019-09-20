/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package incometax;
import java.util.Scanner;

/**
 *
 * @author joham3169
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Anual Income Less Than 42,960");
        int income;
        income = Input.nextInt();
        
        if (income >= 10000 && income <= 20000) {
        int tax = 1203;
        int value = tax * income;
        System.out.println("Your Anual Income Tax is " + value / 10000);
    }
        if (income >= 20001 && income <= 30000){
            int taxes = 1763;
            int valuee = taxes * income;
            int end = valuee/10000;
            System.out.println("Your Anual Taxes are " + end);
             
        }
        if (income >= 30001 && income <= 42960){
            int taxess = 2042;
            int valueee = taxess * income;
            int endd = valueee/10000;
            System.out.println("Your Anual Income Is " + endd);
        }
        
        if (income > 42960){
            System.out.println("That Number Is Out Of Range");
        }
        
        //int tax = 176 * income;
        
        //System.out.println("Your Anual Tax Is " + tax / 1000);
        
        
    }
    
}
