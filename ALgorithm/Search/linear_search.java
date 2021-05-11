import java.util.*;
import java.lang.*;
class linear_search
{
	public static int linear_s(int[] arr, int value)
	{
		System.out.println("Linear Search \n TIME COMPLEXTY : n\n SPACE COMPLEXITY : 1");
		for(int i =0; i< arr.size;i++)
		{
			if(arr[i] == value) return i;
		}
	}
	public static int binary_s(int[] arr, int value)
	{ 
		mid = 

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the array elements");
		System.out.println("hurray!!  fgsrt  ");
		for(int i : arr)
		{
			i = sc.nextInt();
		}
		System.out.println("Enter the number that you want to search");
		int number = sc.nextInt();
		System.out.println("Type 1 : Linear Search \t Type 2 : Binary Search");
		int choice = sc.nextInt();
		switch(choice):
			case 1:
				linear_s(arr,number);
				break;
			case 2:
				binary_s(arr,number);
				break;
	}
}