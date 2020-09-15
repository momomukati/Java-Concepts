import java.util.Scanner;
import java.io.*;

public class Order{

   public static void main(String[] args){
         int num1 = Integer.parseInt(args[0]);
       int num2 = Integer.parseInt(args[1]);
        int num3= Integer.parseInt(args[2]);
         int num4 = Integer.parseInt(args[3]);
         
         int count =0;
         
         for(int i=0; count!=4; i++)
         {
            if(i==num1||i==num2||i==num3||i==num4)
            {
               System.out.println(i);
               count++;
            }
            
         }
       
      
   }

}
