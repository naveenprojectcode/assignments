package assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String [] name= new String[]{"Alice Jhonson","Bob Smith","Carol Davis","David Brown","Eva Green"};
	
	double [] baseSalary= new double[] {75000.0f,68000.0f,82000.0f,90000.0f,60000.0f};
	
	double[] exp=new double[] {5.1f,3.2f,7.1f,10.2f,2.4f};
	
	double[] yer=new double[] {4.2,3.8,4.5,2.5,3.5};
	
	Map<String, Double> result=new LinkedHashMap<String,Double>();
	
	for(int i=0; i<baseSalary.length;i++)
	{
		
		//int r=0;
		
		if(yer[i]>=4.0)
		{
			
			if(exp[i]>=5)
			{
			
			double hike=0;
			double hikePercentage=0;
			
			hike=(baseSalary[i]*15.0)+1500+	5000;
			hikePercentage=hike/baseSalary[i];
			
					
			result.put(name[i],hikePercentage );
			
			}
			
			else
				
			{
				double hike=0;
				double hikePercentage=0;
				
				hike=(baseSalary[i]*15.0)+1500;
				hikePercentage=hike/baseSalary[i];
				
						
				result.put(name[i],hikePercentage );
				
				
			}
			
				
			
			
		}
		
		else if(yer[i] >=3 && yer[i] < 4.0)
		{
            //double hike=0;
			
			//=baseSalary[i]*10.0;
					
			//result.put(name[i],hike );
			
			if(exp[i]>=5)
			{
			
			double hike=0;
			double hikePercentage=0;
			
			hike=(baseSalary[i]*15.0)+1500+	5000;
			hikePercentage=hike/baseSalary[i];
			
					
			result.put(name[i],hikePercentage );
			
			}
			
			else
				
			{
				double hike=0;
				double hikePercentage=0;
				
				hike=(baseSalary[i]*15.0)+1500;
				hikePercentage=hike/baseSalary[i];
				
						
				result.put(name[i],hikePercentage );
				
				
			}
		}
		
		else if(yer[i] > 3)
		{
          //  double hike=0;
			
			//hike=baseSalary[i]*3.0;
					
			//result.put(name[i],hike );
			
			if(exp[i]>=5)
			{
			
			double hike=0;
			double hikePercentage=0;
			
			hike=(baseSalary[i]*15.0)+1500+	5000;
			hikePercentage=hike/baseSalary[i];
			
					
			result.put(name[i],hikePercentage );
			
			}
			
			else
				
			{
				double hike=0;
				double hikePercentage=0;
				
				hike=(baseSalary[i]*15.0)+1500;
				hikePercentage=hike/baseSalary[i];
				
						
				result.put(name[i],hikePercentage );
				
				
			}
			
		}
		
		
		
	}
		
	
		
		                          
		
		
		
		
	System.out.println(result);
		
		
		
		
		
	}

}
