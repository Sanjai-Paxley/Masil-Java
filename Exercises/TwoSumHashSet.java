import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSumHashSet {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
      
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if (result.length == 2)
            System.out.println("Indices: " + Arrays.toString(result));
        else
            System.out.println("No two numbers found that add up to target.");

        sc.close();
    }
}
