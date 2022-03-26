class Count{
	static int count = 0;
	Count()
	{
		count = count + 1;
	}
	static void getcount()
	{
		System.out.println("Total objects are:- "+count);
	}
	public static void main(String args[])
	{
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		getcount();
	}
}
