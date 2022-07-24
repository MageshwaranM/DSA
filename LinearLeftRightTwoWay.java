/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinearLeftRightTwoWay
{
	
	public static void search(int arr[], int x, int l, int r)
	{
		int left=l , right = r, position = -1;
		for (; left <= right ;)
		{
			if (arr[left] == x)
			{
				position = left;
				System.out.println("Element found in Array at "
				+ (position + 1) + "Position with "
				+ (left + 1) + " Attempt");
				break;
			}
			
			if (arr[right] == x)
			{
				position = right;
				System.out.println("Element found in Array at "
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

    public static void SearchMain(int arr[],int x)
    {
        
        int low = 0;
        int len = arr.length, high = len-1;
        int mid = (low + high) / 2;

        if (arr[mid] == x)
        {
            System.out.println("Found at "+mid);
        }
        else
        {
            search(arr,x,low,mid-1);
            search(arr,x,mid+1,high);
        }
    }
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("*************");
		int arr[] = {2,44,5,11,55};
		// int x = 1;
		int x = 11;
		
		SearchMain(arr,x);
		
		System.out.println("*************");
	}
}