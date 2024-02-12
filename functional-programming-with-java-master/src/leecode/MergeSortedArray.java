package leecode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0 ; j <n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }

    public static void main(String args[]){
        int[] nums1 = {1,2,3,0,0,0};



        int[] nums2 = {2,5,6};

        MergeSortedArray.merge(nums1, nums1.length, nums2, nums2.length);

    }

}
