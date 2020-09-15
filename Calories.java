import java.io.*;

public class Calories{

   public static void main(String[] args){
      String gender = new String(args[0]);
      int weight = Integer.parseInt(args[1]);
      int age = Integer.parseInt(args[3]);
      int height = Integer.parseInt(args[2]);
      
      double BMR =0;
      double BRM =0;
      
      if(gender.equals("Female"))
      BMR = 655+(4.3*weight)+(4.7*height)-(4.7*age);
      
       else if (gender.equals("Male"))
      BRM = 66+(6.3*weight)+(12.9*height)-(6.8*age);
      
      int Bars = (int)BRM/230;
      int FBars = (int)BMR/230;
      
      int ChocoBars =(int)(Bars +FBars);
      System.out.println("You could eat about " +ChocoBars+ " chocolate Bars to maintain your weight");
      
      
   }

}
