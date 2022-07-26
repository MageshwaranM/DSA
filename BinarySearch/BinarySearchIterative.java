import java.util.*;
import java.lang.*;
import java.io.*;


class BinarySearchIterative {
    public static int search(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;

        while (r >= l)
        {
            int mid = l + ( r - l ) / 2;

            if (arr[mid] == x)
            {
                return mid;
            }


            if (arr[mid] < x )
            {
                l = mid + 1;
            }

            else
            {
                r = mid - 1;
            }

        }

        return -1;
    }


    public static void main( String args[])
    {
        BinarySearchIterative ob = new BinarySearchIterative();

        int arr[] = {1,3,4,5,7,8};
        int n = arr.length;
        int x = 3;
        int result = ob.search(arr,x);

        if (result == -1)
            System.out.println(
                "Element not present"
            );
        else
            System.out.println(
                "element found at"
                +"index "+result
            );

    }
}