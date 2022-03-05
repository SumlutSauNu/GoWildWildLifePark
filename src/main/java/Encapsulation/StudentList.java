package Encapsulation;

public class StudentList {
	public static void main (String[] args) {
		StudentContent s1= new StudentContent();
		StudentContent s2= new StudentContent();
		StudentContent s3= new StudentContent();
		s1.setName("Mg Sau Nu");
		s2.setName("ZinMyoWin");
		s3.setName("BangAung");
		s1.setAge(17);
		s2.setAge(17);
		s3.setAge(17);
		System.out.println("S1 Name"+s1.getName());
		System.out.println("S2 Name"+s2.getName());
		System.out.println("S3 Name"+s3.getName());
	}

}
