
import java.util.Scanner;

public class Numbersadd {
   
   
        Scanner sc = new Scanner(System.in);
        int num1,num2,result;
        
         public void input()
         {
         System.out.println("Entered two numbers to be added:");
         System.out.println("Entere value of num1:");
         num1=sc.nextInt();
         System.out.println("Entered value of num2:");
         num2=sc.nextInt();
         
       
    }
    
    void display()
    {   
        int result;
            result = num1+num2;
      System.out.println(result);
    }
    
    public static void main(String[ ] args)
    {
        Numbersadd nd = new Numbersadd();
        
        nd.input();
       
        nd.display();
        
    }
    
}
