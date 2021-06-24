import java.util.Scanner;

public class MiddleIndexSum {

    public static int findMiddleIndex(int[] arr) throws Exception
    {
        int end = arr.length-1;
        int start = 0, sumLeft=0, sumRight = 0;
        while(true)
        {
            if(sumLeft > sumRight)
            {
                sumRight += arr[end--];
            }
            else
            {
                sumLeft += arr[start++];
            }
            if(start > end)
            {
                if(sumLeft == sumRight)
                {
                    break;
                }
                else
                {
                    throw new Exception("Please pass proper array to match the requirement");
                }
            }
        }
        return end;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        try
        {
            System.out.println("Starting from index 0, adding numbers till index " + findMiddleIndex(arr) + " and adding rest of the numbers can be equal");

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
