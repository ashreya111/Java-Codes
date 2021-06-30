public class DistinctElementsFromArray {

    public static void printElements(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = false;
            for(int j=0;j<i;j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = true;
                    break;
                }

            }
            if(!flag)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        int[] nums = {5,2,7,2,4,7,8,2,3};
        printElements(nums);
    }
}
