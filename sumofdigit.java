import java.util.Scanner;
public class sumofdigit {
	public static int sumofdigits(int n)
	{	

		if(n == 0)
			return 0;
		else
		{	
			return (n%10) + sumofdigits(n/10);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the input");
		int input = sc.nextInt();
		int result = sumofdigits(input);
		System.out.println("The sum of digit is " + result);
		
}
}