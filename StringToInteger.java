import java.util.Scanner;

//Write a program to convert string to number without using Integer.parseInt() method.
public class StringToInteger {
    public static void convert(String s)
    {
        int num=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            num = num*10 + ((int)s.charAt(i) - 48);
        }
        System.out.println(num);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        convert(s);
    }
}
