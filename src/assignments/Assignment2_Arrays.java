package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1. Create a 3D array to represent the following data:
o Semesters as the first dimension.
o Subjects and Status/Marks as the second dimension.
o Actual values for Subject Names and Marks as the third dimension.
2. From the array:
o Print Semester 2 Subject 4 and Subject 5 names.
o Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		 */
	
				
		
		String[][][] exams = new String[5][2][6];
		
		//sem 1
		exams [0][0][0]= "Mathematics1";
		exams [0][0][1]= "physics"; 
		exams [0][0][2]= "chemistry";
		exams [0][0][3]= "computer programming";
		exams [0][0][4]= "Engineering drawing";
		exams [0][0][5]= "Basic electricl engineering";
		
		exams [0][1][0]= "Pass(78)";
		exams [0][1][1]= "pass(85)"; 
		exams [0][1][2]= "fail(21)";
		exams [0][1][3]= "pass(74)";
		exams [0][1][4]= "pass(88)";
		exams [0][1][5]= "pass(79)";
		
		//sem 2
		exams [1][0][0]= "Mathematics2";
		exams [1][0][1]= "Mechanics"; 
		exams [1][0][2]= "Environmental science";
		exams [1][0][3]= "Basic electronics";
		exams [1][0][4]= "Engineering physics";
		exams [1][0][5]= "Engineering graphics";
		
		exams [1][1][0]= "Pass(82)";
		exams [1][1][1]= "pass(77)"; 
		exams [1][1][2]= "pass(93)";
		exams [1][1][3]= "fail(19)";
		exams [1][1][4]= "fail(24)";
		exams [1][1][5]= "pass(90)";
		
		//sem 3
		exams [2][0][0]= "Data structures";
		exams [2][0][1]= "Discrete Mathematics"; 
		exams [2][0][2]= "Digital Electronics";
		exams [2][0][3]= "Operating system";
		exams [2][0][4]= "Signals and systems";
		exams [2][0][5]= "Object orinted programming";
		
		exams [2][1][0]= "Pass(88)";
		exams [2][1][1]= "pass(81)"; 
		exams [2][1][2]= "pass(76)";
		exams [2][1][3]= "fail(32)";
		exams [2][1][4]= "pass(85)";
		exams [2][1][5]= "pass(78)";
		
		//sem4
		exams [3][0][0]= "Algorithms";
		exams [3][0][1]= "Computer networks"; 
		exams [3][0][2]= "Database systems";
		exams [3][0][3]= "Microprocessors";
		exams [3][0][4]= "Communication Engineering";
		exams [3][0][5]= "Software Engineering";
		
		exams [3][1][0]= "Pass(91)";
		exams [3][1][1]= "pass(73)"; 
		exams [3][1][2]= "fail(19)";
		exams [3][1][3]= "pass(80)";
		exams [3][1][4]= "pass(76)";
		exams [3][1][5]= "pass(87)";
		
		//sem5
		exams [4][0][0]= "Probability and statistics";
		exams [4][0][1]= "Machine learning"; 
		exams [4][0][2]= "Compiler design";
		exams [4][0][3]= "Theory of computation";
		exams [4][0][4]= "Embeeded systems";
		exams [4][0][5]= "Computer graphics";
		
		exams [4][1][0]= "Pass(86)";
		exams [4][1][1]= "pass(88)"; 
		exams [4][1][2]= "pass(84)";
		exams [4][1][3]= "pass(95)";
		exams [4][1][4]= "pass(73)";
		exams [4][1][5]= "pass(90)";
		
		
		System.out.println("semester 2's subject 4 and subject 5 name is "+exams [1][0][3] +" and "+ exams [1][0][4]);
		System.out.println("Status/Marks of Semester 4 Subject 3 and Subject 6 " +exams [3][0][2] +" and "+ exams [3][0][5] );
		
		
		
		
		
	}

}
