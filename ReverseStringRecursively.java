import java.util.Scanner;

public class ReverseStringRecursively {
    public static void ReverseString(String str)
    {
        if((str==null) || (str.length()<=1))
        {
            System.out.println(str);
        }
        else
        {
            System.out.println(str.charAt(str.length()-1));
            ReverseString(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ReverseString(str);
    }
}
