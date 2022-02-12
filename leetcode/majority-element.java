import java.util.HashMap;

class Solution {
  HashMap<Integer, Integer> numbers = new HashMap<>();

  public int majorityElement(int[] nums) {
    for (int i : nums) {
      if (numbers.containsKey(i))
        numbers.replace(i, numbers.get(i) + 1);
      else
        numbers.put(i, 1);
    }
    for (int i : numbers.keySet()) {
      if (numbers.get(i) > nums.length / 2)
        return i;
    }
    return 0;
  }
}