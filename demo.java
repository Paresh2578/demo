import java.util.*;

class demo {
    public static int wordBreak(int n) {
        
        // for()
        return solve(n , "");
    }

    public static int solve(int n , String s){
        if(s.length() == n){
            // System.out.print(s + " , ");

            if(isValid(s)){
                return 1;
            }else{
                return 0;
            }
        }

        // for(int i=0;i<n;i++){
        //     solve(n , "")
        // }

        return solve(n, s+"P") + solve(n, s+"A") + solve(n, s+"L");
    }

    public static boolean isValid(String s){
        int l=0,a=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A'){
                a++;
            }
            if(a > 1) return false;
            if(l >= 3) return false;
            if(s.charAt(i) == 'L'){
                l++;
            }else{
                l=0;
            }
        }
        if(a > 1) return false;
        if(l >= 3) return false;
        return true;
    }



    public static void main(String[] args) {
         System.out.println(wordBreak(10101));
    }
}



