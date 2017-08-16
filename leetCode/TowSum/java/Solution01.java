/**
  * 
    Example:
      Given nums = [2, 7, 11, 15], target = 9,
      Because nums[0] + nums[1] = 2 + 7 = 9,
      return [0, 1].
  */
public class Solution01{
  public static int[] towSum(int[] nums, int target){
    int length = nums.length;
    for(int i = 0; i < length; i++){
      for(int j = i + 1; j < length; j++){
        if(target == nums[i] + nums[j]){
          return new int[] {i, j};
        }
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
