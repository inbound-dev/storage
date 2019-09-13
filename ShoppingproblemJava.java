/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoppingproblem.java;

import java.util.Scanner;


/**
 *
 * @author jordan Hamilton
 */
public class ShoppingproblemJava {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
       
        
                
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Keyboards Would you Like To Purchase?");
        int keyboards; 
        keyboards = input.nextInt();
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("How Many USB Storage Divices Would You Like to Purchase");
        int usb;
        usb = input1.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("How Many Mice Would You Like to Purchase");
        int mice;
        mice = input2.nextInt();
        
        int value = keyboards*4999;
        int value1 = mice*2599;
        int value2 = usb*1999;
        int value3 = usb + mice + keyboards;
        
        System.out.println("Your Total is " + value3);
        
          
       // System.out.println(total);  
       // System.out.println("Your Total Is " + total);
        
      //  System.out.println("You Are Buying " + keyboards + " keyboards");
      //  System.out.println("You Are Buying "  + usb + " USB Divices");
      // System.out.println("You Are Buying " + mice + " Computer Mice");\
        
        
        
        
    }
    
}
