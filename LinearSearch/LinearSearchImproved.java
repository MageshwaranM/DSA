/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinearSearchImproved
{
	
	public static void search(int arr[], int x)
	{
		int len = arr.length;
		int left , right = len-1, position = -1;
		
		
		for (left = 0; left <= right ;)
		{
			if (arr[left] == x)
			{
				position = left;
				System.out.println("Element fount in Array at "
				+ (position + 1) + "Position with "
				+ (left + 1) + " Attempt");
				break;
			}
			
			if (arr[right] == x)
			{
				position = right;
				System.out.println("Element fount in Array at "
				+ (position + 1) + " Position with "
				+ (right + 1) + " Attempt");
				break;
			}
			
			left++;
			right--;
		}
		if(position == -1)
		{
			System.out.println("Not found in Array with " + left + " Attempt");
			
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("*************");
		int arr[] = {2,44,5,11,55};
		// int x = 1;
		int x = 11;
		
		search(arr,x);
		
		System.out.println("*************");
	}
}