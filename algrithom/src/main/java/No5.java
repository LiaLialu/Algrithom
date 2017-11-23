/**
 * Created by lu.jie on 2017/11/22.
 * Longest Palindromic Substring
 */
public class No5 {
    int max = 0;
    String maxStr = "";
    public String longestPalindrome(String s) {
        if(s==null||s.isEmpty()||s.length()<2){
            return s;
        }

        int length = s.length();
        for(int i=0; i<length; i++){
            getPos(s, i-1, i+1);
            getPos(s, i, i+1);//to simplify
        }
        return maxStr;
    }

    public void getPos(String s, int j, int k){
        while(j>=0&&k<s.length()&&s.charAt(k)==s.charAt(j)){
            j--;
            k++;
        }
        if(max<k-j-1){
            max = k-j-1;
            maxStr = s.substring(j+1, k);
        }
    }


    /**
     * leetcode best
     * @param args
     */
//    int len = 0, maxLen = 0, center = 0;
//    public String longestPalindrome(String s) {
//        char[] chars = s.toCharArray();
//        len = s.length();
//        if (len <= 1) return s;
//        for (int i = 0; i < len; i++) {
//            i = manacher(chars, i);
//        }
//        return s.substring(center, center + maxLen);
//    }
//    public int manacher(char[] chars, int k) {
//        int i = k, j = k;
//        while (j < len - 1 && chars[j] == chars[j + 1]) j++;
//        int nextCenter = j;
//        while (i >= 0 && j < len && chars[i] == chars[j]) {
//            i--;
//            j++;
//        }
//        if (j - i - 1 > maxLen) {
//            maxLen = j - i - 1;
//            center = i + 1;
//        }
//        return nextCenter;
//    }


    public static void main(String[] args){
        No5 s = new No5();
        System.out.println(s.longestPalindrome("baba"));
//        System.out.println(s.longestPalindrome("bb"));
//        System.out.println(s.longestPalindrome("b"));
//        System.out.println(s.longestPalindrome("feoqoewe"));
//        System.out.println(s.longestPalindrome("kdsfif"));
//        System.out.println(s.longestPalindrome("cbbd"));
    }
}
