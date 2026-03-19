package baiTap_buoi8;

import java.util.Scanner;

public class BaiTapHam {

    // 1. Hàm tìm số lớn nhất trong 3 số
    public static int timMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    // 2. Hàm kiểm tra số chẵn hay lẻ
    public static void kiemTraChanLe(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
    }

    // 3. Hàm tính tổng 3 số
    public static int tinhTong(int a, int b, int c) {
        return a + b + c;
    }

    // 4. Các hàm tính toán
    public static int cong(int a, int b) {
        return a + b;
    }

    public static int tru(int a, int b) {
        return a - b;
    }

    public static int nhan(int a, int b) {
        return a * b;
    }

    public static double chia(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Bài 1
        System.out.println("Nhap 3 so a b c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = timMax(a, b, c);
        System.out.println("So lon nhat la: " + max);

        // Bài 2
        System.out.print("Nhap so can kiem tra chan le: ");
        int n = sc.nextInt();
        kiemTraChanLe(n);

        // Bài 3
        int tong = tinhTong(a, b, c);
        System.out.println("Tong 3 so la: " + tong);

        // Bài 4
        System.out.println("\nChon phep tinh:");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");

        int chon = sc.nextInt();

        System.out.print("Nhap so thu nhat: ");
        int x = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int y = sc.nextInt();

        switch (chon) {
            case 1:
                System.out.println("Ket qua: " + cong(x, y));
                break;

            case 2:
                System.out.println("Ket qua: " + tru(x, y));
                break;

            case 3:
                System.out.println("Ket qua: " + nhan(x, y));
                break;

            case 4:
                if (y == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    System.out.println("Ket qua: " + chia(x, y));
                }
                break;

            default:
                System.out.println("Lua chon khong hop le");
        }
    }
}
