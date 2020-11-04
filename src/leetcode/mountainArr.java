package leetcode;

public class mountainArr {
    public static void main(String[] args) {
        int arr[] = {0,1,2,5,3,4,2};
        System.out.println(validMountainArray(arr));
        System.out.println();
    }

    static boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int i = 0, temp = 0;
        int max = A[0];
        for (i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                temp = i;
            }if(A[i] == A[i-1]){return false;}
        }
        if (temp == 0 || temp == A.length - 1) {
            return false;
        }
        for (i = 0; i < temp-1; i++) {
            if (A[i + 1] < A[i]) {
                return false;
            }
        }
        for (i = temp; i < A.length-1; i++) {
            if (A[i + 1] > A[i]) {
                return false;
            }
        }
        return true;
    }


}
