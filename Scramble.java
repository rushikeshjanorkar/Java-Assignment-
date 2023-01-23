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
		
		String[] words = {("he jnmn m ")};
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        System.out.println("reverseOrderOfWordsString = " + reverseString);
        return reverseString;
    }

	}


