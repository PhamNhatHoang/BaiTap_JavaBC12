package baiTap_buoi6;

import java.util.Scanner;

public class Bai4_TinhS {
    static double tinhS(double x, int n) {
        double s = 0;
        double power = 1; // sẽ nhân dần để ra x^k
        for (int k = 1; k <= n; k++) {
            power *= x;   // power = x^k
            s += power;   // cộng x^k
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x: ");
        double x = sc.nextDouble();

        System.out.print("Nhap n (>=1): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n phai >= 1");
            return;
        }

        System.out.println("S(n) = " + tinhS(x, n));
    }
}

