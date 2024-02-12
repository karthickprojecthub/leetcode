package leecode.stringProbs;

import java.util.List;

public class LastWordLength {
    public static void main(String[] args) {
        String s= "luffy is still joyboy";
        List<String> strList = List.of(s.split(" "));
        System.out.println(strList.get(strList.size()-1).length());
    }
}
