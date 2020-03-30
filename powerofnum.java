import java.util.Scanner;
public class powerofnum {
	public static int power(int n,int r)
	{	
		if(r==0)
			return 1;
		else
			return n*power(n,r-1);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the input");
		int input = sc.nextInt();
		System.out.println("Please provide raised power");
		int raisedPower = sc.nextInt();
		int result = power(input,raisedPower);
		System.out.println("The result is " + result);
		
}
}