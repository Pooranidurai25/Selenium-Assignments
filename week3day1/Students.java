package week3day1;

public class Students {
	
	public void getStudentInfo(int id) 
	
	{
System.out.println(id);
	}
	
	public void getStudentInfo(int id, String name) 
	{
System.out.println(id);
System.out.println(name);

	}
	
	public void getStudentInfo(String email, int phonenumber) 
	{
System.out.println(email);
System.out.println(phonenumber);

	}


	public static void main(String[] args) 
	
	{
Students obj =new Students();

obj.getStudentInfo(4);
obj.getStudentInfo("gggg", 23432525);
obj.getStudentInfo(45, "fried");
	}

}
