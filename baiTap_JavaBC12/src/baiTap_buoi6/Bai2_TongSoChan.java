package baiTap_buoi6;

import java.util.Scanner;

public class Bai2_TongSoChan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhap n
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        // DUNG FOR
        int sumFor = 0;
        for (int i = 2; i <= n; i += 2) {
            sumFor += i;
        }
        System.out.println("Tong so chan tu 1 den n (for) = " + sumFor);

        // DUNG WHILE
        int sumWhile = 0;
        int i = 2;
        while (i <= n) {
            sumWhile += i;
            i += 2;
        }
        System.out.println("Tong so chan tu 1 den n (while) = " + sumWhile);
    }
}
