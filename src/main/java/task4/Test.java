package task4;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public Integer[] nums = {3, 6, 14, 2, 7, 42, 15, 19};

    public List<Integer> findPrimeNum(Integer[] nums) {

        List<Integer> primeNums = new ArrayList<>();

        for (int i = 0; i <= nums.length-1; i++) {
            int counter = 0;
            for (int num = nums[i]; num >= 1; num--) {
                if (nums[i] % num == 0)
                    counter = counter + 1;
            }
                if (counter == 2)
                    primeNums.add(nums[i]);
        }
        return primeNums;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.findPrimeNum(test.nums));
    }
}
