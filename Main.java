import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void FindCommonElement(String[] arr1, String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i=0;i< arr1.length;i++)
        {
            for (int j=0;j< arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set)
        {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args)
    {
        String[] arr1 = { "Article", "by", "shreya", "agarwal"};
        String[] arr2 = {"shreya", "agarwal"};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Common Elements: ");
        FindCommonElement(arr1, arr2);
    }
}
