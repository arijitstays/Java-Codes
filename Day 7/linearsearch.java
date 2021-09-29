import java.util.Scanner;
class linearsearch
{
    public static void main(String args[])
    {
        int c,n,search,array[];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of elements : ");
        n = in.nextInt();
        array = new int[n];
        System.out.println("Enter"  + n +  "elements");
        for(c=0;c<n;c++)
            array[c] = in.nextInt();
        System.out.println("Enter search elenment : ");
        search = in.nextInt();
        for(c=0;c<n;c++)
        {
            if(array[c]==search)
            {
                System.out.println(search + "present at" + (c+1));
                break;
            }
        }
            if(c==n)
                System.out.println(search + "isn't present");
    }
}
