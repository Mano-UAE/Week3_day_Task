package week3day1;


// Method Overloading

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id ,String name)
	{
		System.out.println(id + name);
	}
	public void getStudentInfo(String email,long Phonenumber)
	{
		System.out.println(email + Phonenumber);
	}

	public static void main(String[] args) 
	{
	
          Students S=new Students();
          S.getStudentInfo(10);
          S.getStudentInfo(5 , " Mano ");
          S.getStudentInfo(" Brock@gmail.com ", 8946022543l);
	}

}
