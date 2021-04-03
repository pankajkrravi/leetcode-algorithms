package com.demo.project.arrayCode;
// # 896. Monotonic Array
//.What is a monotonic array?
//An array is monotonic if it is either monotone increasing or monotone decreasing.
public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
      boolean increasing=true;
      boolean decreasing=true;
      for(int i=0;i<A.length-1;i++)
      {
          if (A[i] > A[i+1])
              increasing=false;
             if(A[i] < A[i+1])
                 decreasing=false;
      }
      return increasing || decreasing;
    }
}
