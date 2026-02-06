package baiTap_buoi3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong co 2 chu so (10..99): ");
        int n = sc.nextInt();

        if (n < 10 || n > 99) {
            System.out.println("So nhap vao khong hop le (phai tu 10 den 99).");
        } else {
            int hangChuc = n / 10;
            int hangDonVi = n % 10;
            int tong = hangChuc + hangDonVi;

            System.out.println("Tong 2 chu so = " + tong);
        }

        sc.close();
    }
}
