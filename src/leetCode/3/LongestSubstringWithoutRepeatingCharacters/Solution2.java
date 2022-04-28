import java.util.*;

public class Solution2 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                //ans = Math.max(ans, j - i);
                ans = Math.max(ans, set.size());
            } else {
                set.remove(s.charAt(i++));
            }

        }

        return ans;

    }

    public static void main(String[] args){
        String str = "dfalkjldksjfas";
        int length = lengthOfLongestSubstring(str);
        System.out.printf("\nlength = %s\n", length);
    }
}
