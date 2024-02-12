package leecode.stringProbs;

public class BackSpaceCompare {
    public static void main(String[] args) {

        String s = "TCD##D";
        String p = "TACD##D";
        char[] c1 = s.toCharArray();
        char[] c2 = p.toCharArray();
        System.out.println("Back Space Compare : "+backSpaceCompare(c1,c2));
    }

    private static boolean backSpaceCompare(char[] c1, char[] c2){

        int p1 = c1.length-1;
        int p2 = c2.length-1;

        while(p1 >= 0 || p2 >= 0){

            if(c1[p1] == '#' || c2[p2] == '#'){
                if(c1[p1] == '#'){
                    int backCount = 2;
                    while(backCount > 0){
                        p1--;
                        backCount --;
                        if(p1<0){
                            break;
                        }
                        if(c1[p1] == '#'){
                            backCount = backCount +2;
                        }
                    }

                }
                if(c2[p2] == '#'){
                    int backCount = 2;
                    while(backCount > 0){
                        p2--;
                        backCount --;
                        if(p2 < 0){
                            break;
                        }
                        if(c2[p2] == '#'){
                            backCount = backCount +2;
                        }
                    }

                }
            }else{
                if(c1[p1] != c2[p2]){
                    return false;
                }else{
                    p1--;
                    p2--;
                }
            }
        }

        return true;
    }
}
