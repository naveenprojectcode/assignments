package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map <String,Integer> bankTransaction=new LinkedHashMap<String,Integer>();
		
		bankTransaction.put("Transaction1",50000);
		bankTransaction.put("Transaction2",-2000);
		bankTransaction.put("Transaction3",3000);
		bankTransaction.put("Transaction4",-15000);
		bankTransaction.put("Transaction5",-200);
		bankTransaction.put("Transaction6",-300);
		bankTransaction.put("Transaction7",4000);
		bankTransaction.put("Transaction8",-3000);
		
		
		int creditcount=0;
		int debitcount=0;
		int creditamounts=0;
		int debitamounts=0;
		int suspiciousTransactionCount=0;
		//int suspiciousTransactionAmount=0;
		
		List<Integer> suspiciousTransactionAmount=new ArrayList<Integer>();
		
		for(int i=1 ; i<=bankTransaction.size(); i++)
			
			
			//Print total number of credit and debit transactions completed
			
			
			
		{ if(bankTransaction.get("Transaction"+i)<0)
		
		{
			
			
			debitcount++;
			debitamounts=debitamounts+bankTransaction.get("Transaction"+i);
			
		
			
		}
		
		else //(bankTransaction.get("Transaction"+i)>0)
		{
			creditcount++;
			creditamounts=creditamounts+bankTransaction.get("Transaction"+i);
			
		}
			
			
	//	System.out.println(bankTransaction.get("Transaction"+i));
		
		
		 if (bankTransaction.get("Transaction"+i) > 10000 || bankTransaction.get("Transaction"+i) < -10000)
		
		{	suspiciousTransactionCount++;
		
		//System.out.println(bankTransaction.get("Transaction"+i));
		suspiciousTransactionAmount.add(bankTransaction.get("Transaction"+i));
		
			
		}
		
		
		}
			
		System.out.println("total number of credit transactions is "+creditcount+" and debit transactions is "+debitcount);
		
		System.out.println("total amount credited is "+creditamounts+" and total amount debited  is "+debitamounts);
		
		System.out.println("total amount remaining in bank is  "+(creditamounts+debitamounts) );
		
		System.out.println("Suspiciious credit/debit Transaction count is "+suspiciousTransactionCount+" and amount is "+suspiciousTransactionAmount);
		
		
	
			
		
		
	
	}
	
	

}
