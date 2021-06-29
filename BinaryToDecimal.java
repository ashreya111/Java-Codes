import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int decimal = Integer.parseInt(str, 2);
        System.out.println(decimal);
    }
}
