class Student{
	int roll;
	String name;
	String branch;
	String university_name;
	
	void set(int x,String n,String b,String un)
	{
		roll = x;
		name = n;
		branch = b;
		university_name = un;
	}
	void show()
	{
		System.out.println(roll);
		System.out.println(name);
		System.out.println(branch);
		System.out.println(university_name);
	}
	public static void main(String args[])
	{

		Student s1 = new Student();
		int x = Integer.parseInt(args[0]);
		s1.set(x,args[1],args[2],args[3]);
		s1.show();
	}
		
}
