import java.util.*;
public class factorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the input");
		int number = sc.nextInt();
		int result = 1;
		for(int i=number;i>1;i--)
		{
			result = result * i;
		}
		System.out.println("The result is " + result);
	}

}
