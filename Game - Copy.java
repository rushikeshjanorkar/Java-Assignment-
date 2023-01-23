//Write a package for Games, which have 2 classes, Indoor and Outdoor. Use function
//display() to generate list of players for the specific games. Use default and parameterized
//constructors.


package JavaPractice;

import java.util.Scanner;


class Indoor{
	private String Game,Player ;
	
	public Indoor(){
		
	}
	
	public Indoor(String g ,String p) {
		
		Game = g ;
		Player = p ;
		
	}
	
	public void accept () {
		    Scanner s=new Scanner(System.in);
			System.out.println("Enter The Game Name");
			Game=s.nextLine();
			
			System.out.println("Enter The Player Name");
			Player =s.nextLine();
		
	}
	
	public void Display() {
		
		System.out.print("Game:"+Game+
		           "\nPlayer:"+Player
		           );
		
	}
}

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner (System.in);
		System.out.println("Enter No player:");
		int n = s.nextInt();
		
		Indoor m[]=new Indoor[n];
	
		for(int i=0;i<n;i++) {
			m[i]=new Indoor();						//manager object create
			m[i].accept();
		}
		
		for(int i=0;i<n;i++) {
			m[i].Display();
		}
	}  

}
