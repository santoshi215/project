
public class Mehtodc {
    public void addition()
	{
		  int num1,num2,result;
			num1 = 34;
			num2 =76;
			result = num1+num2;
			System.out.println("Sum of num1 & num2 is: "+result);
	}
 public void multiplication(int num1,int num2)  //method definition
	{
		 int result;
		
			result = num1*num2;
			System.out.println("Multiplication of num1 & num2 is: "+result);
	
	}
public int subtraction()
	{
		 int num1,num2,result;
			num1 = 34;
			num2 =76;
			result = num1-num2;
			System.out.println(result);
        	return 0;
		
	}
public int division(int num1,int num2)
	{
		int result = num1/num2;
		return result;
		
	}

    
    
    
  public static void main(String[] args) {
		
		Mehtodc object = new Mehtodc();
    
		
		object.addition(); 
		
		
		object.multiplication(12,12);
		
		int num = object.subtraction();
		System.out.println("subtraction: "+num);
		
		
	    int result=object.division(20, 10);
	    System.out.println("Division :"+result);


  }
}
