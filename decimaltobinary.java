import java.util.Scanner;
public class decimaltobinary {
	public static void decimal2binary(int n)
	{	
		if(n>0)
		{
			System.out.print(n%2);
			decimal2binary(n/2);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the input");
		int input = sc.nextInt();
		decimal2binary(input);
		
		
}
}