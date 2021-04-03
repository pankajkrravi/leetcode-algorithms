package com.demo.project.arrayCode;
// # 1470. Shuffle the Array
public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int x=0;
        int y =n;
        for(int i = 0;i<nums.length;i++){
            if(i%2==0)
                result[i]= nums[x++];
            else
                result[i]=nums[y++];

        }
        return result;
    }
}
