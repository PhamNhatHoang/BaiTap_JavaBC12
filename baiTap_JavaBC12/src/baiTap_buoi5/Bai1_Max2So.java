package baiTap_buoi5;

import java.util.Scanner;

public class Bai1_Max2So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        if (m > n) {
            System.out.println("So lon nhat: " + m);
        } else if (n > m) {
            System.out.println("So lon nhat: " + n);
        } else {
            System.out.println("Hai so bang nhau: " + m);
        }
    }
}
