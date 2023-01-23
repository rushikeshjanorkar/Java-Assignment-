//Write a Java program to create n objects of the Student class. Assign
//roll numbers in the ascending order. Accept name and percentage from
//the user for each object. Define a static method “sortStudent” which
//sorts the array on the basis of percentage.


package JavaPractice;

import java.util.Scanner;
import java.util.Iterator;

public class SortStudent {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String name;
			int rollno=1;
			double per;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enterno of student L");
			int n=Integer.parseInt(sc.nextLine());
			
			SortStudent s[] = new SortStudent[n] ;
			for(int i=0; i<n;i++) {
				System.out.println("Enter name of student :" +(i+1) + ":");
				
				name=sc.nextLine();
				
				System.out.println("Enter percentage of student" +(i+1) + ":");
				
				per=Double.parseDouble(sc.nextLine());
				
				rollno=i+1;
				
				s[i] =new SortStudent(name,rollno ,per);
				
			}
			
			sc.close();
			for(int i=0 ;i<n ;i++) {
				s[i].showData();
			}
		}
			}

	}

}
