package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        //return Arrays.stream(nums).distinct().toArray().length;
        int c = 0;
        int[] newArr = new int[10];
        for(int i : nums){
            if(i != val){
                newArr[c] = i;
                c++;
            }
        }
        System.out.print("Print");
        for(int j : newArr){
            System.out.print(j);
        }
        return c;
    }

    static void sort012(int a[], int n)
    {
        Arrays.stream(a).sorted().forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int[] nums1 = {1,0,1,0};
        RemoveElement.sort012(nums1, 2);
        System.out.println(RemoveElement.removeElement(nums, 3));
    }
}
