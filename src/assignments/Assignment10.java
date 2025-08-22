package assignments;

public class Assignment10 {

	public static void main(String[] args) {
	
		int[] numbers=new int[] {12,34,11,36,87,98,93};
		
		
		for(int i=0;i<numbers.length; i++ )
		
		{
			
			for (int j=i+1; j<(numbers.length);j++ )
			{    
				
				if(numbers[i]>numbers[j])
				{
					
					int temp=numbers[i]; // temp=12
					
					numbers[i]=numbers[j];
					numbers[j]=temp;
					
					
				}
				
				
			}
			
			
			
			
		//	System.out.println(finalnumber[i]); 
			
			
		}
		
for(int num : numbers)
{
	System.out.println(num)	;
	
}
}
}
