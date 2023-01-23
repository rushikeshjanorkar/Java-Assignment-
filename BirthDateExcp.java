/*Create a class BirthDate with parameterized constructor which takes three arguments -
date, month and year. Raise an exception if the birthdate is invalid.*/

package JavaPractice;


public class BirthDateExcp {
int day,month,year;
boolean state,checkmonth,checkday;
	
	BirthDateExcp(int d,int m ,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	boolean checkmonth()
	{
		if(month <1 || month >12 )
			return false;
		
		else return true;
	}
	
	boolean checkday()
	{
		if(day <1 || day >31)
			state=false;
		
		else {
			switch(month)
			{
			case 1:
				
			case 3:
				
			case 5:
			case 7:
				
			case 8:
			case 10:
				
			case 12:
				if(day >31)
				{
					state =false;
				}
				else 
					state =true;
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				if(day >30)
				{
					
				}

			}
				
		}
		return checkday;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
