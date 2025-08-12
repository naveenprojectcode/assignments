package assignments;

public class Assignment3_class_EmpGroups extends Assignment3_class_Employee{
	

	
String[] emp_names= new String[] {Emp_name1,Emp_name2,Emp_name3};

	
	int[] emp_ids=new int[] {emp_id1,emp_id2,emp_id3};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3_class_EmpGroups object = new Assignment3_class_EmpGroups();
		
		System.out.println("Employee name :"+object.emp_names[0]+" and Employee_id "+object.emp_ids[0]);
		System.out.println("Employee name :"+object.emp_names[1]+" and Employee_id "+object.emp_ids[1]);
		System.out.println("Employee name :"+object.emp_names[2]+" and Employee_id "+object.emp_ids[2]);
		
	}


}
