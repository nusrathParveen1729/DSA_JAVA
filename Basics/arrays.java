public class arrays {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};


        //fetching a value
        System.err.println(nums[1]);

        //change the value
        nums[1] = 6;
        System.out.println(nums[1]);

        int num2[] = new int[4];
        num2[0] = 4;
        num2[1] = 4;

        System.out.println(num2[1]);

        //we can print all th evalues by printing the list alone
        //we can instead use a loop 

        for (int i =0;i<=3;i++)
        {
            System.out.println(num2[i]);
        }

    }
}
