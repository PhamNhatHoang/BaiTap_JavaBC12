package baiTap_buoi6;

import java.util.Scanner;

public class Bai3_TongSoLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n (>0): ");
            n = sc.nextInt();
        } while (n <= 0);

        long sum = 0;
        for (int i = 1; i < n; i += 2) { // chỉ đi số lẻ
            sum += i;
        }

        System.out.println("Tong cac so le duong < n = " + sum);
    }
}

