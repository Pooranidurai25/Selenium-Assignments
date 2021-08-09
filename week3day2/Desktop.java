package week3day2;

public abstract class Desktop implements Hardware, software{
	
	// abstract class cannot be instantiated so need to create a subclass
	//implemented method
	
	public void desktopModel(int modelnumber)
	
	{
System.out.println(modelnumber);
	}
	
	//unimplemented methods
	
	public abstract void version();
	

	public static void main(String[] args) 
	
	{
		
	}

}
