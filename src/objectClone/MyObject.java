package objectClone;

public class MyObject implements Cloneable{
	
	String objName;
	
	// HashCode will reveal that the main object and clone are not the same.
	void doTask() {
		System.out.println(this.objName + " with HashCode " + this.hashCode() + " has been created successfully!");
	}
	
	public MyObject(String objName) {
		super();
		this.objName = objName;
	}

	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  

}
