import java.util.*;

class Disp{
	public synchronized void  wish(String name){
		for(int i = 0;i<5;i++){
			System.out.print("Hello : ");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(name);
	}
	}
}
class Mythread extends Thread{
	Disp d;
	String name;
	Mythread(Disp d,String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}
class Demo{
	public static void main(String []args){
		Disp d = new Disp();
		Mythread m1 = new Mythread(d,"Akash");
		m1.start();
		
		Mythread m2 = new Mythread(d,"Aman");
		m2.start();
	}
}
