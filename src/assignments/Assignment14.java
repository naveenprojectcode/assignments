package assignments;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] prices= new int[] {7,1,5,3,6,4};
		
		int buyday=1;
		int sellday=4;
		int profit=0;
		
		
		//List<Integer> result=new ArrayList<Integer>();
		Set<Integer> result=new TreeSet<Integer>();
		
		for (int i=0;i<prices.length;i++)
		{
			
			for(int j=1+i;j<prices.length;j++)
			{
			profit=prices[j]-prices[i];
			result.add(profit);
			
			}
			
			
		}
			
		
	
		//int max_profit=result.size()-1;
			
		List <Integer> finals= new ArrayList<Integer>();
		for (int num : result)
			
		{	
			finals.add(num);
		
		
		}
		
		int max_profit=finals.size()-1;
		 if(finals.get(max_profit)>0)
		
		System.out.println("Maximum profit for given array is "+finals.get(max_profit));
		 
		 else
		 {
			 System.out.println("No profit occured");
		 }
			 
	}

}
