//Write a program to implement ArrayList.
import java.util.ArrayList;
import java.util.Scanner;

public class ImplementArrayList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(int i=0;i<n;i=i+2)
            arr.add(i);

        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);

    }
}
