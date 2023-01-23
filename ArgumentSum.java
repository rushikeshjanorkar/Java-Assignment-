//Write a Java program to find the sum of command line argument and count the invalid
//integers entered through command line.
//eg. $java myprog 8 2 8.2 6 4 4.8
//Output:
//Total numbers entered = 6
//Invalid integers = 2
//Sum of integers = 20


package JavaPractice;

class argsum{
}

public class ArgumentSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n,count=0,sum=0;
		
		for(int i=0 ; i<args.length ;i++) 
		{
			try {
				n=Integer.parseInt(args[i]);
				sum=sum+n;
			}
			
			catch (NumberFormatException e) {
				count++;
				
				
			}
		}
		
		System.out.println("Total no of value :" +args.length);
		
		System.out.println("Sum of only valid integers is =" +sum);
		
		System.out.println("Invalid integers are :" +count);
		
		
		
	}

	}


