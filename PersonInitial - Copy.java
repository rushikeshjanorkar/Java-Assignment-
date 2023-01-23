//Write a Java program that inputs a person's name in the form of First Middle Last, and
//then prints it in the form Last First M., where ''M.'' is the person's middle initial.


package JavaPractice;

import java.util.Scanner;

public class PersonInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the First Name");
		String first = sc.nextLine();
		System.out.println("Enter the Middle Name");
		String Middle = sc.nextLine();
		System.out.println("Enter the last Name");
		String last = sc.nextLine();
		
		System.out.println(last+" "+first+" "+Middle.charAt(0));
		
		

	}

}
