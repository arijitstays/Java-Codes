import java.util.*;
class bubblesort
{
    public static void main(String[] args)
    {
    int c,n,arr[];  
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    arr = new int[n];  
    System.out.println("Enter those " + n + " elements");  
    for(c = 0; c < n; c++)  
      arr[c] = in.nextInt(); 
    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j<n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    }
    for (int i=0; i<n; ++i)
            {
                System.out.print(arr[i] + " ");
            }
        System.out.println();
    }
    }