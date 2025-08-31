package assignments;

public class Assginment12_primenumber {

	public static void main(String[] args) {
		
		int num=87;
		
		//System.out.println(num%3);
		
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			
			if(num%i==0)
			{
				count++;
				
				break;
				
			
				
				
				
			}
			
			
			
		}
		

		if (count==0)
		{
			System.out.println("Given number is  a prime");
		}
		
		else
		{
			System.out.println("Given number is not a prime");
		}
		
	}

}
