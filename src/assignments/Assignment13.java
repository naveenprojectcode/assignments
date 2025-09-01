package assignments;

class result  {

	
		
		
		
		
		
		public int pow(int a,int b)
		{
		   int j=1;
			
			for (int i=1;i<=b;i++)
			{
				j=j*a;
				//break;
			}
			
			return j;
		}
		
		
		
}

	
	
	 public class Assignment13
	{
	
		
		public static void main(String[] args) {
			
		result obj=new result();
		
		//obj.pow(2,3);
		System.out.println(obj.pow(4,2));
		
		}
		
}
	


