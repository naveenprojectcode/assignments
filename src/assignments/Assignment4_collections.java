package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Assignment4_collections {

	public static void main(String[] args) {
		
		//student details
		
		Map <String,String> student_detail_list_1= new LinkedHashMap<String,String>	();
		
		student_detail_list_1.put("Name", "John Doe");
		student_detail_list_1.put("Age", "Twenty");
		student_detail_list_1.put("Gender", "Male");
		student_detail_list_1.put("Roll number", "SBA12345");
		student_detail_list_1.put("Grade", "A++");
		student_detail_list_1.put("Major", "computer science");
		student_detail_list_1.put("GPA", "A3.8");
		student_detail_list_1.put("Emamil", "john@example.com");
		student_detail_list_1.put("PAN Number", "SDF6543210");
		student_detail_list_1.put("Address", "123 Elm St");
		
	
		
          Map <String,String> student_detail_list_2= new LinkedHashMap<String,String>();
		
		student_detail_list_2.put("Name", "Jane Smith");
		student_detail_list_2.put("Age", "Twenty One");
		student_detail_list_2.put("Gender", "Female");
		student_detail_list_2.put("Roll number", "SBA12346");
		student_detail_list_2.put("Grade", "B+");
		student_detail_list_2.put("Major", "Mathematics");
		student_detail_list_2.put("GPA", "A3.5");
		student_detail_list_2.put("Emamil", "jane@example.com");
		student_detail_list_2.put("PAN Number", "REW6543211");
		student_detail_list_2.put("Address", "456 Oak St");
		
		
		  Map <String,String> student_detail_list_3= new LinkedHashMap<String,String>();
			
			student_detail_list_3.put("Name", "JMike Brown");
			student_detail_list_3.put("Age", "Twenty Two");
			student_detail_list_3.put("Gender", "Male");
			student_detail_list_3.put("Roll number", "SBA12347");
			student_detail_list_3.put("Grade", "A+");
			student_detail_list_3.put("Major", "Physics");
			student_detail_list_3.put("GPA", "A3.9");
			student_detail_list_3.put("Emamil", "mike@example.com");
			student_detail_list_3.put("PAN Number", "TYR6543212");
			student_detail_list_3.put("Address", "789 Pine St");
			
			List<Map <String,String>> student_details= new ArrayList<Map <String,String>>();
			
			student_details.add(student_detail_list_1);
			student_details.add(student_detail_list_2);
			student_details.add(student_detail_list_3);
			
			//Employee Details
			
			
		
			
	          Map <String,String> Employee_detail_list_1= new LinkedHashMap<String,String>();
			
	          Employee_detail_list_1.put("Employee ID", "E001");
	          Employee_detail_list_1.put("Name", "Alice Green");
	          Employee_detail_list_1.put("Age", "Thirty");
	          Employee_detail_list_1.put("Gender", "Female");
	          Employee_detail_list_1.put("Department", "Engineering");
	          Employee_detail_list_1.put("Position", "Software Engineer");
	          Employee_detail_list_1.put("Salary", "75K Pounds");
	          Employee_detail_list_1.put("Email", "alice@example.com");
	          Employee_detail_list_1.put("PAN Number", "SDF6543210");
	         
			
			
			  Map <String,String>  Employee_detail_list_2= new LinkedHashMap<String,String>();
				
			  Employee_detail_list_2.put("Employee ID", "E002");
	          Employee_detail_list_2.put("Name", "Bob Johnson");
	          Employee_detail_list_2.put("Age", "Thirty Five");
	          Employee_detail_list_2.put("Gender", "Male");
	          Employee_detail_list_2.put("Department", "Marketing");
	          Employee_detail_list_2.put("Position", "Marketing Manager");
	          Employee_detail_list_2.put("Salary", "85K Pounds");
	          Employee_detail_list_2.put("Email", "bob@example.com");
	          Employee_detail_list_2.put("PAN Number", "REW6543211");
	          
	          Map <String,String>  Employee_detail_list_3= new LinkedHashMap<String,String>();
				
			  Employee_detail_list_3.put("Employee ID", "E003");
	          Employee_detail_list_3.put("Name", "Carol White");
	          Employee_detail_list_3.put("Age", "Twenty Eight");
	          Employee_detail_list_3.put("Gender", "Female");
	          Employee_detail_list_3.put("Department", "Sales");
	          Employee_detail_list_3.put("Position", "Sales Executive");
	          Employee_detail_list_3.put("Salary", "65K Pounds");
	          Employee_detail_list_3.put("Email", "carol@example.com");
	          Employee_detail_list_3.put("PAN Number", "TYR6543212");
			
				List<Map <String,String>> Employee_details= new ArrayList<Map <String,String>>();
				
				Employee_details.add(Employee_detail_list_1);
				Employee_details.add(Employee_detail_list_2);
				Employee_details.add(Employee_detail_list_3);
				
				
				//product details
				
				 Map <String,String> product_detail_list_1= new LinkedHashMap<String,String>();
					
		          product_detail_list_1.put("Product ID", "P001");
		          product_detail_list_1.put("Name", "Laptop");
		          product_detail_list_1.put("Category", "Electronics");
		          product_detail_list_1.put("Price", "12K Pounds");
		          product_detail_list_1.put("Stock Quantity", "Not Available");
		          product_detail_list_1.put("Supplier", "Tech Supplies");
		          product_detail_list_1.put("Warranty", "2 years");
		          product_detail_list_1.put("Rating", "4.5 Stars");
		          product_detail_list_1.put("Manufacturing Date", "Aug 2023");
		          product_detail_list_1.put("Expiry Date", "Aug 2028");
		         
				
				
				  Map <String,String>  product_detail_list_2= new LinkedHashMap<String,String>();
					
				      product_detail_list_2.put("Product ID", "P002");
			          product_detail_list_2.put("Name", "Desk Chair");
			          product_detail_list_2.put("Category", "Furniture");
			          product_detail_list_2.put("Price", "150K Pounds");
			          product_detail_list_2.put("Stock Quantity", "Two");
			          product_detail_list_2.put("Supplier", "Office Depot");
			          product_detail_list_2.put("Warranty", "1 year");
			          product_detail_list_2.put("Rating", "4 Stars");
			          product_detail_list_2.put("Manufacturing Date", "Sep 2024");
			          product_detail_list_2.put("Expiry Date", "N/A");
		          
		          Map <String,String>  product_detail_list_3= new LinkedHashMap<String,String>();
					
		          
		          
		          product_detail_list_3.put("Product ID", "P003");
		          product_detail_list_3.put("Name", "Coffee Maker");
		          product_detail_list_3.put("Category", "Kitchen");
		          product_detail_list_3.put("Price", "75 Pounds");
		          product_detail_list_3.put("Stock Quantity", "Two Hundred");
		          product_detail_list_3.put("Supplier", "KitchenWorld");
		          product_detail_list_3.put("Warranty", "6 months");
		          product_detail_list_3.put("Rating", "4.2 Stars");
		          product_detail_list_3.put("Manufacturing Date", "Jan 2025");
		          product_detail_list_3.put("Expiry Date", "Jan 2027");
		          
		         
	          
				
					List<Map <String,String>> product_details= new ArrayList<Map <String,String>>();
					
					product_details.add(product_detail_list_1);
					product_details.add(product_detail_list_2);
					product_details.add(product_detail_list_3);
					
					
					Map<String,List<Map <String,String>>> Final_details= new LinkedHashMap<String,List<Map <String,String>>>();
					
					Final_details.put("student", student_details);
					Final_details.put("employee", Employee_details);
					Final_details.put("product", product_details);; 
					
					
					System.out.println("Product supplier details is "+ Final_details.get("product"));// dont get idea to fetch supplier
		

	}

}
