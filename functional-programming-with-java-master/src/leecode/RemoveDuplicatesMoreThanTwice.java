package leecode;

public class RemoveDuplicatesMoreThanTwice {
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=2;i<nums.length;i++) {
            System.out.println("i = "+i+" j = "+(j-1)+" nums[" + i + "] = " + nums[i] + "-------------nums[" + (j - 1) + "] = " + nums[j - 1]);
            if (nums[i] != nums[j - 1])
                nums[++j] = nums[i];
        }
        for(int k: nums){
            System.out.println(k);
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,2,3,3};
        System.out.println("0,1,1,1,1,2,3,3");
        System.out.println(RemoveDuplicatesMoreThanTwice.removeDuplicates(nums));
    }
}
