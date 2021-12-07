package Com.java;

public class ApproxYears {
public static void main(String[] args) {
		
		int movienumber[]= {1,2,3,4,5,6,7,8};
		int movieyear[]= {2001,2002,2004,2005,2007,2009,2010,2011};
		//String moviename[]= {"Harry Potter and the  Stone","Harry Potter and the Chamber of Secrets"," Harry Potter and the Prisoner of Azkaban",
			//	              "Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince",
			//	              "Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};

	




	
	int year=((movieyear[movieyear.length - 1]-movieyear[0])/movienumber.length); 
	int month=((movieyear[movieyear.length - 1]-movieyear[0])%movienumber.length);
	
			       
	System.out.println("\n average number of years for movie release is "+year+" years and "+month+" months" );    //average no of years for movie release in years and months

	
	

	

}
}
