package leecode;

public class OperationstoanArray {

    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
                for(int i=0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        for(int k : nums){
            System.out.println(k);
        }
        int[] arr = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            if(nums[i] != 0){
                arr[i] = nums[i];
            }
        }

        for(int k : arr){
            System.out.println(k);
        }
    }
}
