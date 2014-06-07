class School
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.setId(100);
		s.setName("sangeetha");
		s.setSal(20000);
		s.setMarks(77);
		System.out.println("Details are:");
		System.out.println("Employee id"+s.getId());
		System.out.println("Employee name"+s.getName());
		System.out.println("Employee Adress"+s.getSal());
		System.out.println("Student marks"+s.getMarks());
	}
}
/*
E:\JAVAprograms\Inheritance>javac School.java

E:\JAVAprograms\Inheritance>java School
Details are:
Employee id100
Employee namesangeetha
Employee Adress20000.0
Student marks77.0

E:\JAVAprograms\Inheritance>*/
