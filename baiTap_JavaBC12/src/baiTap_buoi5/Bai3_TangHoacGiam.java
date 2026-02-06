package baiTap_buoi5;

import java.util.Scanner;

public class Bai3_TangHoacGiam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        System.out.print("Chon thu tu (1=Tang dan, 2=Giam dan): ");
        int chon = sc.nextInt();

        // Sap xep tang dan truoc
        if (a > b) { int t = a; a = b; b = t; }
        if (a > c) { int t = a; a = c; c = t; }
        if (b > c) { int t = b; b = c; c = t; }

        if (chon == 1) {
            System.out.println("Tang dan: " + a + " " + b + " " + c);
        } else if (chon == 2) {
            System.out.println("Giam dan: " + c + " " + b + " " + a);
        } else {
            System.out.println("Lua chon khong hop le!");
        }
    }
}

