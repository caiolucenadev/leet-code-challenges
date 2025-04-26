import java.util.HashMap;
import java.util.Map;

class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));

    }

    public static int removeDuplicates(int[] nums) {
        int[] unrepeated = nums;

        Map<Integer, Integer> repeatedElemets = new HashMap<>();
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                int value = repeatedElemets.get(nums[i]) == null ? 1 : repeatedElemets.get(nums[i]);
                repeatedElemets.put(nums[i], value + 1);
                k++;
            }
        }
        int j = 0;
        int l = 0;
        while (j < unrepeated.length) {
            nums[l] = unrepeated[j];
            if (repeatedElemets.containsKey(unrepeated[j])) {
                j += repeatedElemets.get(unrepeated[j]);
            } else {
                j++;
            }
            l++;
        }
        return nums.length - k;
    }
}