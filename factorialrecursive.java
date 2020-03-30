import java.util.Scanner;
public class factorialrecursive {
    public static int recFactorial(int n)
    {	
    	int result = 1;
    	if(n==1)
    		return result;
    	else
    		return n*recFactorial(n-1);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the input");
		int number = sc.nextInt();
		int result = recFactorial(number);
		System.out.println("The result is " + result);
		}

}
