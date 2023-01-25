/*Create a class BirthDate with parameterized constructor which takes three arguments -
date, month and year. Raise an exception if the birthdate is invalid.*/

package JavaPractice;


class Invalid extends Exception{
	
}
public class BirthDateExcp {
      private int date,month,year;
      
      public BirthDate(int d,int m,int y) {
    	  date=d;
    	  month=m;
    	  year=y;
    	  
      }
      public void Display() {
    	  System.out.println(date +"/"+month+"/"+year);
      }
	
      
      public static void main(String[] args) {
		
		int d,m,y;
		d=Integer.parseInt(args[0]);
		m=Integer.parseInt(args[1]);
		y=Integer.parseInt(args[2]);
		
		
      try {
    	  switch(m)
    		{
    			case 4:
    		    case 6:
    	     	case 9:
    			case 11:
    				if (d>=1 && d<=30)
    				{}
    				else throw   new Invalid ();
    				break ;
    				
    				
    			case 1:
    			case 3:
    			case 5:
    			case 7:
    			case 8:
    			case 10:
    			case 12:
    			   	if (d>=1 && d<=31)
    			   	{}
    				else throw   new Invalid ();
    				break ;
    			    	
    			case 2:
    				if ((y%4==0 && y%100!=0 || y%400==0))
    			    	{
    			    		if(d>=1 && d<=29)
    			    		{}
    	    				else throw   new Invalid ();
    	    				break ;
    					}
    					else
    					{
    						if(d>=1 && d<=28)
    						{}
    	    				else throw   new Invalid ();
    	    				break ;
    			    			
    					}	
    			default :
    		
				throw   new Invalid ();
			
    		}
    	  BirthDateExcp bd = new BirthDateExcp(d, m, y);
    	  
    	  bd.Display();
      }catch (Invalid e) {
    	  System.out.println("Invalid Brith date");
      }
      
	}

}
