class xyz {
	int x,y,z;
	xyz(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void show(){
		System.out.println("x = "+x+", Y = "+y+", Z = "+z);
	}
}
class abc extends xyz{
	int a ,b;
	abc(int a,int b,int c,int d,int e){
		super(c,d,e);
		this.a = a;
		this.b = b;
		
	}
	void show(){
		super.show();
		System.out.println("a = "+a+", b ="+b);
	}
}
class User{
	public static void main(String []args){
	abc c = new abc(2,3,4,5,6);
	c.show();
	}
}
