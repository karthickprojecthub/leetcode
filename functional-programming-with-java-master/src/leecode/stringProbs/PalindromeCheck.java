package leecode.stringProbs;

public class PalindromeCheck {

    private static boolean palindromeCheck(String str){
        int left=0, right=str.length()-1;
        while(left < (str.length()/2)+1){
            System.out.println("Compare = "+str.charAt(left) +" : "+ str.charAt(right));
            if(!(str.charAt(left) == str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        //String str = "A man, a plan, a canal: panama";
        String str = "race a car";
        //String str = "abcba";
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println("String :"+palindromeCheck(str));
    }


}
