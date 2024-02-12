package leecode.stringProbs;

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabccbabcedrwac";
        System.out.println("Longest Sub String: "+longestSubString(s));

    }
    private static int longestSubString(String s){
        int longest = 0, left=0;
        HashMap<Character, Integer> hMap = new HashMap<>();

        for(int right = 0; right <= s.length()-1; right++){
            char currChar = s.charAt(right);
            Integer previousSeenChar = hMap.get(s.charAt(right));
            if(previousSeenChar != null){
                if(previousSeenChar >= left){
                    left = previousSeenChar + 1;
                }
            }

            hMap.put(s.charAt(right), right);
            longest = Math.max(longest, (right-left)+1);
        }

        return longest;
    }
}
