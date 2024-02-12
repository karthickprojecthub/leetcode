package leecode;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        //int[] nums = {3,2,1,0, 4};

        System.out.println("Can Jump "+jump(nums));

    }

    public static boolean jump(int[] nums){
        int destination=nums.length-1; //making the destination as the last index of the array
        for(int i=nums.length-2;i>=0;i--){ //iterating from the second last index
            //if the current index + the value at that index is greater or equal to the destination
            //then just change your destination to the index
            System.out.println("nums["+i+"] :"+nums[i] +" sum :"+(i+nums[i])+" Destination :"+destination);
            if(i+nums[i]>=destination){
                destination=i;
            }
        }
        //if the final index reaches 0 that means we reached end of the array thus function return true
        return destination==0;
    }

    public static boolean canJump(int[] nums){
        if(nums.length <=2){
            return true;
        }
        int i = 1;
        int temp=0;
        while(i < nums.length-1){
            temp=i + nums[i];
            i = nums[i];

            if(nums[temp] == 0 && i != (nums.length-1)){
                return false;
            }
            if(temp == (nums.length-1)){
                System.out.println("Print : "+i +"Length :"+(nums.length-1));
                return true;
            }
        }

        return false;
    }
}
