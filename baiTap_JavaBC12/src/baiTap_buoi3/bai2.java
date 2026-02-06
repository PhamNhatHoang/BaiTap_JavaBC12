package baiTap_buoi3;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double x = 8;

        System.out.print("Nhap a (so thuc): ");
        double a = sc.nextDouble();

        System.out.print("Nhap n (so nguyen khong am): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("n phai >= 0!");
        } else {
            double p = a * Math.pow(x, n);
            System.out.println("P(8) = " + p);
        }
    }
}
