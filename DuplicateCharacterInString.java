//Wrie a program to find out duplicate characters in a string.
import java.util.Scanner;

public class DuplicateCharacterInString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count;
        String str = sc.nextLine();
        char string[] = str.toCharArray();
        System.out.println("Duplicate characters in the string are: ");
        for(int i=0; i<string.length;i++)
        {
            count = 1;
            for(int j=i+1;j<string.length;j++)
            {
                if(string[i] == string[j] && string[i] != ' ')
                {
                    count++;
                    string[j] = '0';
                }
            }
            if(count>1 && string[i]!= '0')
               System.out.println(string[i]);
        }
    }
}
