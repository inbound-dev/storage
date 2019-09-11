/*
 * This Program Prompts User to Input The Number Of Monitors They Own
 * And The Number of Computers They Own and It Prints Those Values
 * 
 */

package waterconsumtion;

import java.util.Scanner;
/**
 *
 * @author Jordan Hamilton
 */
public class NewClass {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Monitors You Own ");
        String keyedinput;
        keyedinput = input.nextLine();
        
        Scanner Input1 = new Scanner(System.in);
        System.out.println("Enter Number Of Computers You Own");
        String computers; 
        computers = Input1.nextLine();
     
        
        System.out.println("You Own " + keyedinput + " Monitors");
        System.out.println("You Own " + computers + " Computers");
   }
}
