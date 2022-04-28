import java.util.*;

public class Solution02{

  public static int[] towSum(int[] nums, int target){

    Map<Integer, Integer> map = new HashMap<>();

    int length = nums.length;
    for(int i = 0; i < length; i++ ){
      map.put(nums[i], i);
    }
    for(int i = 0; i < length; i++){
      int complement = target - nums[i];
      if(map.containsKey(complement)){
        return new int[] {i, map.get(complement)};
      }
    }

    throw new IllegalArgumentException("No tow sum solution");

  }

  public static void main(String[] args){
    int[] nums = new int[] {2, 7, 11, 15};
    int target = 9;

    int[] res = towSum(nums, target);

    System.out.printf("%s = %s + %s \n", target, nums[res[0]], nums[res[1]]);
    System.out.printf("return [%s, %s] \n", res[0], res[1]);
  }
}
