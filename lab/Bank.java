class Bank{
	double getROI(){
		double a = 2.0;	
		return a;
	}
}
class Hdfc extends Bank{
	double getROI(){
		double a = 4.0;	
		return a;
	}
}
class Sbi extends Bank{
	double getROI(){
		double a = 4.5;	
		return a;
	}
}
class Pnb extends Bank{
	double getROI(){
		double a = 5.0;	
		return a;
	}
}
class user{
public static void main(String []args){
	Bank b = new Bank();
	System.out.println("General Rate of interest is:- "+b.getROI());
	b = new Hdfc();
	System.out.println("Rate of interest of HDFC is :- "+b.getROI());
	b = new Sbi();
	System.out.println("Rate of interest of SBI is:- "+b.getROI());
	b = new Pnb();
	System.out.println("Rate of interest of PNB is :- "+b.getROI());
	}
	
}
