package Year2;

import java.util.Scanner;

public class MinMax2 {
    int min;
    int max;

    void dnc_maxmin2(int[] A, int i, int j, int min, int max) {
        int mid;
        if (i == j) { //if there is only 1 element in array
            this.max = A[0];
            this.min = A[0];
        } else if (i + 1 == j) { //if there are 2 elements in array
            if (A[0] > A[1]) {
                this.max = A[0];
                this.min = A[1];
            } else {
                this.max = A[1];
                this.min = A[0];
            }
        } else {
            mid = (i + j) / 2;
            dnc_maxmin2(A, i, mid, this.min, this.max);
            int max1 = this.max;
            int min1 = this.min;
            dnc_maxmin2(A, mid + 1, j, this.min, this.max);

            if (min1 < min)
                this.min = min1;

            if (max1 > max)
                this.max = max1;
        }
    }

    public void main(String[] args) {
        MinMax2 ob = new MinMax2();
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.print("Enter size: ");
        size = sc.nextInt();

        int[] arr;
        arr = new int[size];

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ob.dnc_maxmin2(arr, 0, size - 1, arr[0], arr[0]);
        System.out.println("\n>>Divide & Conquer Method<<\nMinimum element is: " + this.min + "\nMaximum element is: " + this.max);
    }
}
