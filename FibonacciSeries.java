import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        int n1 = 0, n2 = 1, n3, i, number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.print(n1 + ", " + n2);
        for (i=2;i<number;i++)
        {
            n3=n1+n2;
            System.out.print(", " + n3);
            n1=n2;
            n2=n3;
        }
    }
}
