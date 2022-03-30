import java.util.Scanner;
class Matrix{
	public static void main(String args[])
	{
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int num,flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:- ");
		num = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] == num)
				{
					System.out.println("Element found");
					flag = 1;
					break;
				}
			}
			if(flag == 1)
			{
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Element Not found");
		}
		
	}
}
