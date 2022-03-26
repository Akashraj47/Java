class Account{
	int w,x,y,z;
	Account(int a,int b)
	{
		w = a;
		x = b;
	}
	Account(int a,int b,int c)
	{
		this(a,b);
		y = c;
	}
	Account(int a,int b,int c,int d)
	{
		this(a,b,c);
		z = d;
	}
	void get()
	{
		System.out.println("w = "+w+"x = "+x+"y ="+y+"z = "+z);
	}
	public static void main(String args[])
	{
		
		Account a1 = new Account(3,4,5,6);
		a1.get();
	}
}
