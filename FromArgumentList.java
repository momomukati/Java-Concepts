public class FromArgumentList{
   
   
public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      int d = Integer.parseInt(args[3]);
      int even=0;
      
      if(a % 2 == 0) even++;
      if(b % 2 == 0) even++;
      if(c % 2 == 0) even++;
      if(d % 2 == 0) even++;
      
      System.out.println("There are "+ even +" even numbers");
}

}
