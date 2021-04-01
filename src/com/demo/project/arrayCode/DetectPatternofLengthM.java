package com.demo.project.arrayCode;
// # 1566. Detect Pattern of Length M Repeated K or More Times
public class DetectPatternofLengthM {
    public boolean containsPattern(int[] arr, int m, int k) {
        if (arr == null || arr.length < m || arr.length < m * k) {
            return false;
        }
        int count = 1;
        for (int start = 0; start < arr.length - m ;) {
            boolean patternFound = hasPattern(arr, start, m);
            if (patternFound) {
                count += 1;
                start += m;
                if (count >= k) {
                    return true;
                }
            } else {
                count = 1;
                start ++;
            }
        }
        return false;
    }

    private boolean hasPattern(int[] arr, int start, int m) {
        for (int i = 0 ; i < m; i ++) {
            if ((start + i + m) >= arr.length ||
                    arr[start + i] != arr[start + i + m]) {
                return false;
            }
        }
        return true;
    }
}
