import java.util.Scanner;
class Student{
	String name;
	int roll;
	String branch;
	static String univ_name = "Graphic Era Hill University";
	void set(String name,int roll,String branch)
	{
		this.name = name;
		this.roll = roll;
		this.branch = branch;
	}
	void get()
	{
		System.out.println("Name :- "+this.name);
		System.out.println("roll no. :- "+this.roll);
		System.out.println("Branch :- "+this.branch);
		System.out.println("University name :- "+this.univ_name);	
	}
	public static void main(String args[])
	{
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		int roll;
		String name,branch,univ;
		System.out.print("\nEnter a name:- ");
		name = sc.nextLine();
		System.out.print("\nEnter Roll no:- ");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.print("\nEnter branch name:- ");
		branch = sc.nextLine();
		System.out.print("\nEnter university name:- ");
		univ = sc.nextLine();
		univ_name = univ;
		s1.set(name,roll,branch);
		System.out.println("\n\n");
		s1.get();
	}
}
