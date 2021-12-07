package Com.java;
import java.util.Scanner;

public class Printmovie {

	
public static void main(String[] args) {
		
		
		//int movienumber[]= {1,2,3,4,5,6,7,8};
		//int movieyear[]= {2001,2002,2004,2005,2007,2009,2010,2011};
		String moviename[]= {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets"," Harry Potter and the Prisoner of Azkaban",
				              "Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince",
				              "Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};
		
       // System.out.println(" length of array " +moviename.length);
        
		System.out.println("enter the movie name between (1-8):");
		
	Scanner input=new Scanner(System.in);
	int number=input.nextInt();
	
	
	
	System.out.println("the movie name  of  "  +number+  " is  "  +moviename[number-1]);
	

	
input.close();
	}

}
