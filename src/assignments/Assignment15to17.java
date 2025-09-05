package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment15to17 {

	public static void main(String[] args) {
		
		//Count the total number of words in the sentence.
		String sen="Java programming is fun and challenging";;
		
		String [] values=sen.split(" ");
		
		System.out.format("Total number of words in sentence is "+values.length + "%n");
		
		//Print the sentence words in reverse order.
		
		for(int i = values.length - 1;i>=0;i--)
		{
			
			String space=" ";
			values[i]=values[i]+ space;
			
			System.out.printf(values[i]);
			
		}
		System.out.printf("%n");
		
		//Convert the first character of each word to uppercase and print original sentence
		
		//System.out.printf((values[1].substring(0,1)).toUpperCase()+values[1].substring(1,values[1].length()));
		System.out.printf("%n");
		
		
		
		for (int i=0; i<=values.length-1;i++)
			
		{
			String modify = "";
			modify= modify + ((values[i].substring(0,1)).toUpperCase()+values[i].substring(1,values[i].length()));
			
			System.out.printf(modify);
			
		}
		
		
		System.out.format("%n");
		
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		String cleanpara=paragraph.replaceAll("[^0-9a-zA-Z] ", " ");
		
		String[] values2= cleanpara.split(" ");
		
		int count=0;
		List <Integer> index= new ArrayList<Integer>();
		
		//System.out.println(values2[6]);
		System.out.println(cleanpara);
		
		
		for(int k=0;k<=values2.length-1;k++)
		{
			if(values2[k].equals("Java"))
					
			{
			
				
				index.add(k);
				
				count++;
			}
				
			
			
		}
		System.out.println("occurences of word Java is "+count+ " Index is" +index); 
		
		
		//If I will pass int rows = 5 then it should print triangle with 5 Rows
		
		int rows=7;
		
		int[] Arr=new int[rows];
		
		StringBuffer chars= new StringBuffer ("*");
		
		
		for (int i=1;i<=Arr.length;i++ )
		
		{   
			System.out.format("%"+i+"s",chars);
			chars.append("*");
			System.out.format("%n");
			
			
		}
		
		
		
	}

}
