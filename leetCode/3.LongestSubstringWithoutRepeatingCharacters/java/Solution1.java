import java.util.Set;
import java.util.HashSet;

public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j <= n; j ++) {
                if(allUnique(s, i, j)) {
                    ans = Math.max(ans, j - 1);
                }
            }
        }

        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
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
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        

    }
}
