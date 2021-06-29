import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
    static int Sum(int n)
    {
        if(n==0)
            return 0;
        return(n%10 + Sum(n/10));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = Sum(num);
        System.out.println("Sum of digits in " + num + " is " + res);
    }
}
