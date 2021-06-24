import java.util.Scanner;
import java.lang.StringBuilder;

public class DecimalToBinary {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        StringBuilder str = new StringBuilder();
        for(int i=num; i>0;i=i/2)
        {
            if(i%2==0)
            {
                str.append(0);
            }
            else
            {
                str.append(1);
            }
        }
        System.out.println(str.reverse());
//        String str1 = str.toString();
//
//        char[] try1 = str1.toCharArray();
//
//        for (int i = try1.length - 1; i >= 0; i--)
//            System.out.print(try1[i]);
    }
}
