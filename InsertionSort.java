import java.util.Scanner;

public class InsertionSort {
        public static void iSort(int arr[])
        {
            int n = arr.length;
            for (int j=1;j<n;j++)
            {
                int k = arr[j];
                int i=j-1;
                while((i>-1) && (arr[i]>k))
                {
                    arr[i+1] = arr[i];
                    i--;
                }
                arr[i+1] = k;
            }
        }
        public static void main(String[] args)
        {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        iSort(arr);
        System.out.println("After insertion sort:");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
    }
}
