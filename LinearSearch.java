/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinearSearch
{
	
	public static int search(int arr[], int x)
	{
		int n = arr.length;
		for (int i = 0 ; i < n ; i++)
		{
			if (arr[i] == x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("*************");
		int arr[] = {2,44,5,11,55};
		// int x = 1;
		int x = 11;
		
		int result = search(arr,x);
		if (result == -1)
		{
			System.out.println("Element is not present in array");
		}
		else
		{
			System.out.println("Element present at index: "+result);
		}
		System.out.println("*************");
	}
}