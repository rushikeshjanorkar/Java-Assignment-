//Write a Java program to accept two file names as command line arguments. Copy only
//those lines from the first file to the second which contains the word ''Computer''.


package JavaPractice;


import java.io.*;
import java.util.Scanner;


public class ArgumentFiel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fr = new FileInputStream("argsfile1.txt");
		Scanner sc = new Scanner(fr);
        FileWriter fw = new FileWriter("argsfile2.txt");

        String s = "computer";
        String p ;

               while (sc.hasNextLine()) {
	           p=sc.nextLine();
	          if((p.indexOf(s))> -1) {
		  fw.write(p+"\n");
	}
}


          fw.close();

          System.out.println("file copeid Sucessfulyy");
   }

}
