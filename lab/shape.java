import java.util.Scanner;
class shape{
	void Area(int side){
		System.out.println("Area of sqaure is :- "+side*side);
	}
	void Area(int len,int bre){
		System.out.println("Area of Rectangle is:- "+len*bre);
	}
	void Area(float base,float height){
		System.out.println("Area of Triangle is :- "+(0.5*base*height));	
	}
	void Area(float radius){
		System.out.println("Area of Triangle is :- "+(radius*radius*3.14));	
	}
	public static void main(String args[]){
		int choice ;
		shape sp = new shape();
		Scanner sc = new Scanner(System.in);		
		System.out.println("1.Square\n2.Rectangle\n3.Triangle\n4.Circle");
		System.out.print("Enter choice to find area:- ");
		choice = sc.nextInt();
		switch(choice){
			case 1: 
				int side;
				System.out.print("Enter side of Square:- ");
				side = sc.nextInt();
				sp.Area(side);
				break;
			case 2: 
				int len,bre;
				System.out.print("Enter Length and Breadth of Rectangle:- ");
				len = sc.nextInt();
				bre = sc.nextInt();
				sp.Area(len,bre);
				break;
			case 3: 
				float base,height;
				System.out.print("Enter Base and Height of Triangle:- ");
				base = sc.nextFloat();
				height = sc.nextFloat();
				sp.Area(base,height);
				break;
			case 4: 
				float rad;
				System.out.print("Enter Radius of circle:- ");
				rad = sc.nextFloat();
				sp.Area(rad);
				break;
			case 5:
				System.out.println("Invalid Choice");
				break;
		}
	}
}
