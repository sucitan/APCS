/**
 * Read the "Read Me"
 */

import java.util.Scanner;
import java.util.*;
import java.*;
public class RollDice
{
  
    Scanner Reader = new Scanner(System.in);
   
    
    public static void main(String[] args)
    {
        int numbers;
        int[] sums= new int[11];
        Scanner Reader = new Scanner(System.in);
        System.out.println("input amount of pairs to be rolled");
        int amountOfPairs = Reader.nextInt();
      
      for (int i=0; i<amountOfPairs; i++){   
      sums[dieRoll()-2]++;   
    }
    for (int j=0;j<sums.length-1;j++){

        
           System.out.println(sums[j]);
       
        
    }
    
}
   private static int dieRoll()
    {
        int i = (int) (Math.random() * 7)+1;
        int j = (int) (Math.random() * 7)+1;
       
        int roll1 = i;
        int roll2 = j;
        int roll = roll1 + roll2; 
        return roll;
    }
}
