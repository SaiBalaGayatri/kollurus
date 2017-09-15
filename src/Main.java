import java.util.Date;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Date birthdate=new Date();
		int id=sc.nextInt();
		String fullname=sc.next();
		double avgmark=sc.nextDouble();
		Student s=new Student(id, fullname, birthdate, avgmark);
	}

}
