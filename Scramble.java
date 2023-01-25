/*Write a Java program that uses the BufferedReader class to accept a string from the user.
Your program should display the number of words in the string. It should also scramble
the words in the string to create a new string and display it. 
For eg. If input string is
“I like to program”
Output should be
Count of words = 4
Scrambled string is;
Program to I like*/


package JavaPractice;

public class Scramble {

	public static StringBuilder main(String[] args) {
		// TODO Auto-generated method stub
		
		String w = "afgs hsgh jgh";
		
        String [] words = w.split(" ");
        
        int n = words.length;
        System.out.println(n);
        Scanner sc = new Scanner(w);
        String [] s = new String[n];
        int i =0;
        while(i<n) {
        	s[i]=sc.next();
        	i++;
        }
        
        for(int j=n-1; j>=0;j--)
        System.out.print(s[j]+" ");
        
    }

	}


