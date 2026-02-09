package baiTap_buoi8;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên: ");
        int n = sc.nextInt();

        int dem = 0;   // đếm số ước của n

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
        }

        if (dem == 2) {
            System.out.println("Số nguyên tố");
        } else {
            System.out.println("Không phải số nguyên tố");
        }
    }
}

