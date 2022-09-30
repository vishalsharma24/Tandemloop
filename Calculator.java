package Package_1;

import java.util.Scanner;


 
  class Calculator
  {
    public static void main (String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter First No");
	  int no1 = s.nextInt();
	  System.out.println("Enter Second No");
	  int no2 = s.nextInt();
	  System.out.println("Select Symbol(+,-,*,/)");
	  String sym = s.next();
      int res;
	  switch(sym)
	  {
	  
	   case"+" : res = no1+no2;
       System.out.println("Addition is :"+res);
       break;
	   
	   case"-" : res=no1-no2;
	   System.out.println("Substraction is:"+res);
	   break;
	   
	   case"*" : res=no1*no2;
	   System.out.println("multipication is:"+res);
	   break;
	   
	   case"/" : res=no1/no2;
	   System.out.println("Division is:"+res);
	   
	   default:System.out.println("Invalid symbol");
	   break;
	  }
	  
	
	
	
	}
  
  }
 