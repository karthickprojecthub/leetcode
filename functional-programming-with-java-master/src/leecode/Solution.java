package leecode;

import java.util.HashMap;

class Solution {

    public static void main(String[] args) {

        int[] nums1 = {1,0,1,0,1};
        Solution s = new Solution();
        System.out.println(s.majorityElement(nums1));

    }
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count=0;
        int majElement = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                count = map.get(nums[i]) +1;

                map.put(nums[i], count);
            }
            else
            {
                map.put(nums[i],1);
            }
            if(map.get(nums[i]) > nums.length /2)
            {
                System.out.println("Majority found :- " + nums[i]);
                majElement = nums[i];
            }
        }
        return majElement;
    }
}
