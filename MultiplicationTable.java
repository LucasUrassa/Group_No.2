//multiplication tables for the number

import java.util.*;
public class MultiplicationTable{
  public static void main(String[] args){
    //help the user to enter for a number.and choose for option
    Scanner input = new Scanner(System.in);
    System.out.println("===Multiplication Table Generator ===\n");
    System.out.println("Choose an option");
    System.out.println("1.Display table for a single number");
    System.out.println("2.Display table for a multiple number");
    System.out.print(" Enter your choice either 1 or 2");

    int choice= input.nextInt();
    switch (choice){
        //Option for single number
      case 1:
        System.out.println("Enter a number: ");
        int a= input.nextInt();
        System.out.println("MUltiplication table for" + a + ":");
        System.out.println("======================================");
        // for loop to generate table
        for (int i=1; i<=12; i++){
          System.out.println(a+ "x" +i+ "=" +(a*i));
      
        }
        System.out.println("========================================");
        }
        break;
    //option for multi numbers.
    case 2:
      // ask user for start and end range
        System.out.println(" Enter start number: ");
        int start = input.nextInt();
      
        System.out.println(" Enter end number: ");
        int end = input.nextInt();
    
        for (int i=start; i<=end ; i++){
        System.out.println("\n Multiplication table of " + i);
    
        for(int j=1 ; j<=i ; j++){
        System.out.println(i+ "x" +j+ "=" +(i*j));
        }
    } 
  }
}
