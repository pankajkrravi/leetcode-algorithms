package com.demo.project.arrayCode;

import java.util.HashSet;
import java.util.Set;

// # 1346. Check If N and Its Double Exist
public class CheckIfNandItsDoubleExist {
        public boolean checkIfExist(int[] arr) {
            Set<Integer> set = new HashSet<>();
            for (Integer num : arr) {
                if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }
}