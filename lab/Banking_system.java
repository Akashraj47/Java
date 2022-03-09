import java.util.Scanner;
class Account{
	int acno;
	String name;
	float amount;
void insert(int a,String n,float am)
{
	acno = a;
	name = n;
	amount = am;
}
void deposite(float x)
{
	amount = amount + x;
}
void withdraw(float y)
{
	if(amount < y)
	{
		System.out.println("Insufficient Balance");
	}
	else{
		amount = amount - y;
	}
}
void checkbalance()
{
	System.out.println("Current balance is:- ");
	System.out.println(amount);
}
void display()
{
	System.out.println(acno);
	System.out.println(name);
	System.out.println(amount);
}
static public void main(String args[])
{
	Account ac = new Account();
	int a;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter account no.:- ");
	a = sc.nextInt();
	String n ;
	float am;
	String s = sc.nextLine();
	System.out.println("Enter Name:- ");
	n = sc.nextLine();
	System.out.println("Enter amount:- ");
	am = sc.nextFloat();
	ac.insert(a,n,am);

	boolean q=true ;
	while(q){
	System.out.println("Enter 1 for deposite,2 for withdraw,3 for checkbalance,4 for Details,5 for Exit"); 
	int choice;
	choice = sc.nextInt();
	switch(choice){
		case 1:
			System.out.println("Enter amount to deposite");
			am = sc.nextInt();
			ac.deposite(am);
			ac.checkbalance();
			break;
		case 2:
			System.out.println("Enter amount to Withdraw");
			am = sc.nextInt();
			ac.withdraw(am);
			ac.checkbalance();
			break;
		case 3:
			ac.checkbalance();
			break;
		case 4:
			
			System.out.println("Your details are:- ");
			ac.display();
			break;
		case 5:
			q = false;
			break;
	}
	}
	
}
}
