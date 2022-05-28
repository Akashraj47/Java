class Customer{
	int bal = 1000;
	public synchronized void Withdraw(int amt){
		System.out.println("Request for balance withdraw:- "+amt);
		if(this.bal < amt){
			System.out.println("Kindly wait...insufficient balance:- "+bal);
		try{
			wait();
		}
		catch(Exception e){
			System.out.println(e);	
		}
		System.out.println("Amaount Withdrawen :- "+(amt));
		this.bal = this.bal - amt;
		System.out.println("Current balance:- "+this.bal);
	}
		
	}
	public synchronized void Deposite(int amt){
		System.out.println("Request for balance Deposite:- "+amt);
		this.bal = this.bal + amt;
		System.out.println("Amount Deposited:- "+amt);
		notify();
	}
}
class Mythread1 extends Thread{
	Customer c;
	Mythread1(Customer c){
		this.c = c;
	}
	public void run(){
		c.Withdraw(2000);	
	}
}
class Mythread2 extends Thread{
	Customer c;
	Mythread2(Customer c){
		this.c = c;
	}
	public void run(){
		c.Deposite(5000);	
	}
}
class Demo{
	public static void main(String args[]){
		Customer c = new Customer();
		Mythread1 m1 = new Mythread1(c);
		m1.start();

		Mythread2 m2 = new Mythread2(c);
		m2.start();
	}
}
