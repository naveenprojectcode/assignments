package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		/* Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		marks [75, 80, 82] Add 10 marks to each students using assignment operators and
		store it into another array, after adding 10 marks identify the average marks of all
		students */
		
		String[] names=new String[3];
		names[0]="Suresh";
		names[1]="Mahesh";
		names[2]="Naresh";
		
		int[] marks=new int[3];
		marks[0]=75;
		marks[1]=80;
		marks[2]=82;
		
		marks[0]+=10;
		marks[1]+=10;
		marks[2]+=10;
		
		int[] addedMarks=new int[3];
		
		addedMarks[0]= marks[0];
		addedMarks[1]= marks[1];
		addedMarks[2]= marks[2];
		
		int averageMarks=(addedMarks[0]+addedMarks[1]+addedMarks[2])/addedMarks.length;
		
		System.out.println("Updated Marks :");
		System.out.println(names[0]+": "+addedMarks[0]);
		System.out.println(names[1]+": "+addedMarks[1]);
		System.out.println(names[2]+": "+addedMarks[2]);
		System.out.println("Average Marks: "+ averageMarks );
		
		
		
	
	}

}
