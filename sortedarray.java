import java.util.Scanner;
public class sortedarray {
    public static int sortCheck(int []a,int index)
    {	
    	int result = 1;
    	if(index == 0)
    		return result;
    	else
    	{
    		if(a[index] > a[index-1])
    			return sortCheck(a,index-1);
    		else
    			return 0;
    	}
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the input");
		int [] a = new int[] {10,20,30,40,50};
		int result = sortCheck(a,4);
		if(result == 1)
			System.out.println("Array is sorted");
		else
			System.out.println("Array is not sorted");
		
}
}