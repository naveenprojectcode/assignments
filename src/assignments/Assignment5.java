package assignments;

public class Assignment5 {

	public static void main(String[] args) {
		
	String	customerName = "John Doe";
	int	creditScore = 720;
	float	income = 55000.0f;
	Boolean	isEmployed = true;
	float	debtToIncomeRatio = 35.0f;
		
	if(creditScore>750)
	{
		System.out.println("Loan is approved");
		
		
		
		
	}
	
	else if(creditScore>=650 && creditScore<=750)
		
	{    

		
		if (income>=50000)
		
		{
			
			
			
			if(isEmployed)
				
			{
				//System.out.println("Loan is considered");
				
				if(debtToIncomeRatio<40)
				{
					System.out.println("Loan is approved");
				}
				
				else 
				{
					System.out.println("Loan is denied as your debt is greater than or equal to 40%");
				}
				
			}
			
			else
			{
				System.out.println("Loan is not considered as you are unemployed");
			}
		}
		
		else 
			
		{
			System.out.println("Loan is not denied as your income is below 50000");
		}
	}
	else
		
	{
		System.out.println("Loan is denied as your credit score is below 650");
	}

}
}
