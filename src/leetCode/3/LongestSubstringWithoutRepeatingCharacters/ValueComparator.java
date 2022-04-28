import java.util.*;

class ValueComparator implements Comparator<Character> {
    Map<Character, Integer> map;

    public ValueComparator(Map<Character, Integer> val) {
        this.map = val;
    }

    @Override
    public int compare(Character a, Character b) {
        if (map.get(a) >= map.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}
