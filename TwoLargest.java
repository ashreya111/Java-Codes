import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements:");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i< array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        int largest1, largest2, temp;
        largest1 = array[0];
        largest2 = array[1];

        if(largest1<largest2)
        {
            temp = largest1;
            largest1 = largest2;
            largest2 = temp;
        }
        for(int i=2; i<array.length; i++)
        {
            if(array[i] > largest1)
            {
                largest2 = largest1;
                largest1 = array[i];
            }
            else if(array[i] > largest2 && array[i] != largest1)
            {
                largest2 = array[i];
            }
        }
        System.out.println("The first largest element is " + largest1);
        System.out.println("The second largest is " + largest2);
    }
}
