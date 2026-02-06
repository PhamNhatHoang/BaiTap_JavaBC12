package baiTap_buoi5;

import java.util.Scanner;

public class Bai2_SapXepTang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        // Sap xep tang dan bang hoan vi
        if (a > b) { int t = a; a = b; b = t; }
        if (a > c) { int t = a; a = c; c = t; }
        if (b > c) { int t = b; b = c; c = t; }

        System.out.println("Tang dan: " + a + " " + b + " " + c);
    }
}
