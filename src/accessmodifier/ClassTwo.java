package accessmodifier;

public class ClassTwo  {

	
	public static void main(String[] args) {
	
	ClassOne obj= new ClassOne(1);
	
	
	obj.objectvar=obj.addition(3);
	
	System.out.println(obj.addition(3));
	
	}
	
}
