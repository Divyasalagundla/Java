package Com.java;

public class ForLoop {
		
	//@SuppressWarnings("null")
	public static void main(String[] args) {

		int movienumber[]= {1,2,3,4,5,6,7,8};
		int movieyear[]= {2001,2002,2004,2005,2007,2009,2010,2011};
		String moviename[]= {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets"," Harry Potter and the Prisoner of Azkaban",
				              "Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince",
				              "Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};
		
			
		int i;
		
		for(i=0;i<movienumber.length;i++) {
			
			System.out.println("movienumber: "+ movienumber[i]);
		    System.out.println("movie name: "+moviename[i]);               //for loop to print all data
			System.out.println("year of release: "+movieyear[i]);
			System.out.println("\n");
		}
		
		
		
		for(int number: movienumber) {
			
			System.out.println("movienumber: "+ movienumber[number-1]);
		    System.out.println("movie name: "+moviename[number-1]);               //for  eachloop to print all data
			System.out.println("year of release: "+movieyear[number-1]);
			
			
		}

}
}
