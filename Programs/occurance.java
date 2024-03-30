package Programs;

import java.util.Arrays;

public class occurance {

    public static void main(String[] args) {
        int []x = {2, 1};
        int s = firstMissingPositive(x);
        System.out.println(s);
        System.out.println(Arrays.toString(x)); //important
    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != i+1 && nums[nums[i]-1] != nums[i]){
                int t = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = t;
            }
            else
                i++;
        }
        int s = 1;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == s)
                s++;
        }
        return s;
    }

    public static int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int[] ans = {-1, -1};
        while(e >= s){
            int mid = s + (e-s)/2;
            if(nums[mid] > target)
                e = mid - 1;
            else if(nums[mid] < target)
                s = mid + 1;
            else{
                e = mid - 1;
            }
        }
        s = 0;
        e = nums.length - 1;
        while(e >= s){
            int mid = s + (e-s)/2;
            if(nums[mid] > target)
                e = mid - 1;
            else if(nums[mid] < target)
                s = mid + 1;
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
}
