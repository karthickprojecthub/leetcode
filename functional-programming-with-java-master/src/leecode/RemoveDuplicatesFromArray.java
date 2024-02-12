package leecode;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static int removeDuplicates(int[] nums){
        int j = 1;
        for(int i=1; i< nums.length; i++){
            System.out.println("nums["+i+"]"+nums[i]+"-------------nums["+(i-1)+"]"+nums[i-1]);
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(RemoveDuplicatesFromArray.removeDuplicates(nums));

    }
}
