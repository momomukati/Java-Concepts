import java.io.*;

public class FromKeyboad{

   public static void main(String[] args){
      
   
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int num3 = Integer.parseInt(args[2]);
      int d =0;
      
      System.out.println("The numbers Divisible by 23 are the following:");
      if(num1 % 23==0) 
      System.out.println(num1);
      if(num2 % 23==0) 
      System.out.println(num2);
   if(num3 % 23==0) 
   System.out.println(num3);

      
   }

}
