/* Write a Java program to accept a string and an integer n as command line arguments and
display the first and last n characters of the string.*/



package JavaPractice;

public class FirstLastChar {

	
		public static void n1 (String str) {
			 int n = str.length();
		 
			 char f1 = str.charAt(0);
				
			 char l1 = str.charAt(n-1);
				
				System.out.println("First: "+f1 );
				System.out.println("Last :" +l1 );
			
		 }

	public static void main(String[] args) {
			// TODO Auto-generated method stub

			FirstLastChar f=new FirstLastChar ();
			
	        f.n1(args[0]);
		    

		}

	}

