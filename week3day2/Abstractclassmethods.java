package week3day2;

public class Abstractclassmethods extends Desktop{
	
	public void hardwareResources(int componentsno, String componentsname) 
{
	}

public void softwareResources(int version, String name) 
{
	System.out.println();

}

@Override
public void version() 
{
	int num = 7;
	System.out.println(num);

}


	public static void main(String[] args)
	
	{
		Abstractclassmethods obj = new Abstractclassmethods();
		obj.hardwareResources(4, "screws");
		System.out.println();
		
		obj.softwareResources(45, "windows");
		System.out.println();
		
		obj.desktopModel(45);
		obj.version();

	}

	
}
