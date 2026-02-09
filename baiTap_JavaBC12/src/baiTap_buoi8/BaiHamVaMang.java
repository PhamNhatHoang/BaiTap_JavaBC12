package baiTap_buoi8;

import java.util.Scanner;

public class BaiHamVaMang {

    public static int sumArray(int[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
        return tong;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Gọi hàm
        int tong = sumArray(arr);
        int max = maxValue(arr);

        System.out.println("Tổng các phần tử trong mảng: " + tong);
        System.out.println("Giá trị lớn nhất trong mảng: " + max);
    }
}
