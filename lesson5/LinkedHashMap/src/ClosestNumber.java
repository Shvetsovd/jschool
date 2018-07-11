import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.lang.Math.*;

public class ClosestNumber {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        randomFill(nums, 10, 20 );
        Integer result = getClosestNumber(nums, 15);

        System.out.println(nums);
        System.out.println(result);
    }

    private static Integer getClosestNumber(List<Integer> nums, int value) {
        Collections.sort(nums);
        int pos = Collections.binarySearch(nums, value);
        if (pos < 0){
            pos = min(abs(pos) - 1, nums.size() - 1);
            if (pos == 0 || pos == nums.size() - 1){
                return nums.get(pos);
            }
        }
        return nums.get(pos);
    }

    private static void randomFill(List<Integer> nums, int size, int bound) {
        final Random r = new Random();
        for (int i = 0; i < size; i++) {
            nums.add(r.nextInt(bound));
        }
    }
}
