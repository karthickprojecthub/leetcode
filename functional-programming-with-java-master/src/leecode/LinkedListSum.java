package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListSum {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,3);
        List<Integer> list2 = Arrays.asList(5,6,4);

        List<Integer> list3 = new ArrayList<>();

        int index = 0, remaining = 0;
        while(index < list1.size()){
            int temp = list1.get(index)+list2.get(index);
            list3.add((temp+remaining)%10);
            remaining = temp/10;

            index++;
        }
        for(int i : list3){
            System.out.println(i);
        }
    }



}
