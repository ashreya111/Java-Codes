import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 0;
        if(num==0)
        {
            System.out.println("No");
        }
        while (num!=1)
        {
            if(num%2!=0)
            {
                flag=1;
                System.out.println("No");
                break;
            }
            num=num/2;
        }
        if(flag==0)
        {
            System.out.println("Yes");
        }
    }
}
