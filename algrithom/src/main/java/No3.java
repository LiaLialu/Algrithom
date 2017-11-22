import java.util.HashMap;
import java.util.Map;

/**
 * Created by lu.jie on 2017/11/21.
 * Longest Substring Without Repeating Characters
 */
public class No3 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.isEmpty()){
            return 0;
        }
        int maxLength = 0;
        Map<Character, Integer> existCharacter = new HashMap<>();
        for(int i=0, j=0; j<s.length(); ++j){
            if(existCharacter.get(s.charAt(j)) != null){
                i = Math.max(i, existCharacter.get(s.charAt(j))+1);
            }
            existCharacter.put(s.charAt(j), j);
            maxLength = Math.max(maxLength, j-i+1);
        }

        return maxLength;
    }


    public static void main(String[] args){
        No3 s = new No3();
        System.out.println(s.lengthOfLongestSubstring("dvdf"));
        System.out.println(s.lengthOfLongestSubstring("au"));
        System.out.println(s.lengthOfLongestSubstring("bbbbbb"));
        System.out.println(s.lengthOfLongestSubstring("bb"));
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }
}
