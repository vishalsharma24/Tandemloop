package Package_1;
import java.util.Scanner;

class Count 
{

	public static void main(String[] args)
	{
		



		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the length of the array");

		int length=obj1.nextInt();

		int a[]= new int[length];

		System.out.println("Enter the array elements");

		for (int i=0;i<length;i++)
		{
	
			a[i]=obj1.nextInt();
		}

		for (int i=1;i<a.length; i++) 
		
		{
			int b =0;
		for (int j=0;j<a.length-1;j++) 
		{
			if(a[j]%i==0) {
				b++;
			}
		
		
		}

		System.out.println(i+":"+b);

	}


}}