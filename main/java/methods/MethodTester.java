public class MethodTester
{
    private static final int[] A = null;


    public static void main(String[] args) 
    {
        int[] nums = {-1, 5, -1, 3, -1, 17};
        //int[] nums = {-5, -3, -1, 4, 6, 8};
        //int[] nums = { -1, 12, -3, 14, -4, 3 };
        //int[] nums = { 2, -3, 5, -1, 0, 7};
        int result = algorithm1(nums);

        System.out.println("Max sum: " + result);
    }

   
    public static int algorithm1(int[] nums) 
    {
        int maxSum = 0;
       
        int n = nums.length;
       
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int currentSum = 0;
                for (int j = i; j < i + len; j++) {
                    currentSum += nums[j];
                }
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }


    public static int algorithm2(int[] nums) 
    {
        int maxSum = 0;
        
        int currentSum = 0;

    for (int i = 0; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        maxSum = Math.max(maxSum, currentSum);
    }
        
        return maxSum;
    }


    // Optional
    public static int algorithm3(int[] nums)
    {
        int maxSum = 0;
       
        int currentSum = 0;
    int n = nums.length;

    for (int i = 0; i < n; i++) {
        currentSum += nums[i];
        maxSum = Math.max(maxSum, currentSum);
        if (currentSum < 0) {
            currentSum = 0;
        }
    }

        return maxSum;
    }

}
