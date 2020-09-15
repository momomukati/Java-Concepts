import java.util.Scanner;
import java.io.*;

public class CountingNumbers{

   public static void main(String[] args){
         int N = Integer.parseInt(args[0]);
            int M = Integer.parseInt(args[1]);
               int B = Integer.parseInt(args[2]);
               
               int count=0;
               
                 for(int i=N; i<=M; i = i+1){
if (i%B==0) count++;
      }
      
      System.out.println("For all the numbers between ["+ N+", "+M+"] There are "+count+ " numbers that is divisible by "+B);
      
      
   }

}
