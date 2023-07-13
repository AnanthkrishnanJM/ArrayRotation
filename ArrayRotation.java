package Arrayrotation;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 2;
        
        int[] rotatedArray = rotateArray(A, B);
        System.out.println(Arrays.toString(rotatedArray));
    }
    
    public static int[] rotateArray(int[] A, int B) {
        int N = A.length;
          B = B % N;
      
        int[] rotatedArray = new int[N];
        
        for (int i = 0; i < N; i++) {
            rotatedArray[(i + B) % N] = A[i];
        }
        
        return rotatedArray;
    }
}
