import java.util.Set;
import java.util.HashSet;

public class Solution1 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j <= n; j++) {
                if(allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }

        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for(int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if(set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "dfalkjldksjfas";
        int length = lengthOfLongestSubstring(str);
        System.out.printf("\nlength = %s\n", length);
    }
}
