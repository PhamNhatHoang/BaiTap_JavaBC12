package baiTap_buoi8;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        int tong = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }

        System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + tong);
    }
}
