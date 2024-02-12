package leecode;

import java.util.HashMap;

public class MajorityElementCount {

    public static void main(String[] args) {
        int a[] = {1, 0, 2, 1, 0, 3, 1};
        System.out.println(MajorityElementCount.majorityElement(a));

    }

    public static int majorityElement(int a[]){
        int majority = 0;
        int count = 0;
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        for(int i = 0; i<a.length; i++){
            if(hMap.containsKey(a[i])){
                count = hMap.get(a[i]) +1;
                hMap.put(a[i], count);

            }else{
                hMap.put(a[i], 1);
            }
            if(hMap.get(a[i]) > a.length/2){
                majority = a[i];
            }
        }

        return majority;
    }
}
