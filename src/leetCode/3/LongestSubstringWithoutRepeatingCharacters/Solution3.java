import java.util.*;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), j);
            }
             ans = Math.max(ans, j - i + 1);
             map.put(s.charAt(j), j + 1);
        }


        System.out.printf("\n-----sortLengthOfLongestSubstring-----");
        sortMapByVal(map).forEach((key, val) -> System.out.printf("\n%s -> %s", key, val));
        System.out.printf("\n-----sortLengthOfLongestSubstring-----");
        return ans;
    }

    public static void lengthCharacter(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> repetitionCharacter = new HashMap<>();
        for (int j = 0, i = 1; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                Integer val = map.get(s.charAt(j));
                map.put(s.charAt(j), ++val);
                repetitionCharacter.put(s.charAt(j), val);
            } else {
                map.put(s.charAt(j), i);
            }
        }

        System.out.printf("\n-----lengthCharacter-----");
        map.forEach((key, val) -> System.out.printf("\n%s -> %s", key, val));
        System.out.printf("\n-----lengthCharacter-----");
    }

    public static void findSubstring(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            stringBuilder.append("\n");
            stringBuilder.append(c);
            for (int j = i; j < n - 1; j++) {
                String s2 = stringBuilder.toString();
                String[] split = s2.split("\n");
                String s1 = split[split.length - 1];
                char c1 = s.charAt(j + 1);
                if(s1.indexOf(c1) != -1) {
                    break;
                } else {
                    stringBuilder.append(c1);
                }
            }
        }
        String str = stringBuilder.toString();
        System.out.printf("\n-----findSubstring-----");
        System.out.printf(str);
        System.out.printf("\n-----findSubstring-----");
        String[] strArray = str.split("\n");


    }

    public static Map<Character, Integer> 
                sortMapByVal(Map<Character, Integer> map) {
        TreeMap<Character, Integer> sortMap = 
                    new TreeMap<>(new ValueComparator(map));
        sortMap.putAll(map);
        return sortMap;
    }

    public static void main(String[] args) {
        String str = "dfalkjldksjfas";
        // String str = "qpxrjxkltzyx";
        // String str = "abcabcbb123";
        // String str = "pwwkew123";
        lengthCharacter(str);
        findSubstring(str);
        int length = lengthOfLongestSubstring(str);
        System.out.printf("\nlength = %s\n", length);
    }

    
}
