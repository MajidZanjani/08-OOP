package objectClone;

public class ObjectClone {

	public static void main(String[] args) {

		try {
			
			MyObject myObject1 = new MyObject("Majid"); // Making a new Object
			
			myObject1.doTask();
			
			MyObject myObject2 = (MyObject) myObject1.clone(); // Cloning the Object
			
			myObject2.doTask();
			
		} catch (CloneNotSupportedException c) {
		
			System.out.println("Something's wrong!");
		
		}
		
	}

}
