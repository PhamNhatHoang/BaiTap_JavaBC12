package baiTap_buoi8;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int tong = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            tong += arr[i];
        }

        double trungBinh = (double) tong / n;

        System.out.println("Giá trị trung bình của mảng là: " + trungBinh);
    }
}
