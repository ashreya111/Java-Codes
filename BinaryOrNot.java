import java.util.Scanner;

public class BinaryOrNot {
    public static boolean isBinary(int number)
    {
        int copy = number;
        while(copy != 0)
        {
            if(copy%10 > 1) {
                return false;
            }
            copy = copy/10;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isBinary(n));
    }
}
