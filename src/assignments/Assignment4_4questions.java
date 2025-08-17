package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Assignment4_4questions {

	/*
	   Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
cities combined.

	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map <String,Integer> cityLists= new LinkedHashMap<String,Integer>();
		
		cityLists.put("city1", 12000);
		cityLists.put("city2", 8000);
		cityLists.put("city3", 4000);
		cityLists.put("city4", 7000);
		cityLists.put("city5", 6000);
		
		
		System.out.println("total area of the 3rd and 4th is : "+ (cityLists.get("city3") + cityLists.get("city4") ) + " Square feet");	
		
		
		
	

	/*
	   Create a set of the top 10 most visited tourist attractions in the world and print out all
of them and its size.
	 */
	
	Set <String> touristPlace= new LinkedHashSet<String>();
	
	touristPlace.add("Eiffel Tower, Paris");
	touristPlace.add("Grand Bazaar, Istanbul");
	touristPlace.add("Zócalo (Plaza de la Constitución), Mexico City");
	touristPlace.add("Times Square, New York City");
	touristPlace.add("Central Park, New York City");
	touristPlace.add("The Strip, Las Vegas");
	touristPlace.add("Grand Bazaa");
	touristPlace.add("Forbidden City, Beijing");
	touristPlace.add("Niagara Falls (US & Canada)");
	touristPlace.add("Union Station, Washington, D.C.");
	
	System.out.println("Top 10 tourists places is : "+ touristPlace);
	System.out.println("Size of all is :" +touristPlace.size() );
		
	
	/* Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
	6th Value. */
	
	int [] averageNumber= new int[10];
	
	averageNumber[0]=21;
	averageNumber[1]=22;
	averageNumber[2]=23;
	averageNumber[3]=24;
	averageNumber[4]=25;
	averageNumber[5]=26;
	averageNumber[6]=27;
	averageNumber[7]=28;
	averageNumber[8]=29;
	averageNumber[9]=30;
	
    int averageCalculation=(averageNumber[4]+averageNumber[5])/2;
    
    System.out.println("Average of 5th and 6th value is :"+averageCalculation );
	/*
    Create a list of the top 5 highest-grossing movies of all time and print out the third
    movie on the list. */
    
    List<String> moviesList= new ArrayList<String>();
    
    moviesList.add("bahubali");
    moviesList.add("RRR");
    moviesList.add("Robot");
    moviesList.add("coolie");
    moviesList.add("WAR2");
    
    System.out.println("Third movie on the list :"+moviesList.get(2));
    
    
    
    
    
	}
	
}
