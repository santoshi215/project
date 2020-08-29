
import java.util.Scanner;


public class Laptopswitch {
    
    
    void display()
    {
        System.out.println("WELCOME");
    }
    public static void main(String[] args)
    {
        int num;
        Laptopswitch ls = new Laptopswitch();
        ls.display();
       
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the option:");
         num=sc.nextInt();
       
        
        switch(num)
        {
            case 1: 
                 System.out.println("addition");
                 break;
            case 2: 
                 System.out.println("substration");
                 break;
            case 3: 
                 System.out.println("multiplication");
                 break;
            case 4: 
                 System.out.println("division");
                 break;
            default:
                System.out.println("invalid number entered");
                 
        }
        
        
        
    }
    
}
