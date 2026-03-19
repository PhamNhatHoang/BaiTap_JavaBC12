package baiTap_buoi8;

import java.util.Scanner;

public class ThueThuNhapCaNhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap tong thu nhap nam: ");
        double tongThuNhapNam = sc.nextDouble();

        System.out.print("Nhap so nguoi phu thuoc: ");
        int soNguoiPhuThuoc = sc.nextInt();

        double thuNhapChiuThue = tongThuNhapNam - 4000000 - soNguoiPhuThuoc * 1600000;

        if (thuNhapChiuThue < 0) {
            thuNhapChiuThue = 0;
        }

        double thueSuat = 0;

        if (thuNhapChiuThue <= 60000000) {
            thueSuat = 0.05;
        } else if (thuNhapChiuThue <= 120000000) {
            thueSuat = 0.10;
        } else if (thuNhapChiuThue <= 210000000) {
            thueSuat = 0.15;
        } else if (thuNhapChiuThue <= 384000000) {
            thueSuat = 0.20;
        } else if (thuNhapChiuThue <= 624000000) {
            thueSuat = 0.25;
        } else if (thuNhapChiuThue <= 960000000) {
            thueSuat = 0.30;
        } else {
            thueSuat = 0.35;
        }

        double thuePhaiTra = thuNhapChiuThue * thueSuat;

        System.out.println("\n===== KET QUA =====");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Thu nhap chiu thue: " + thuNhapChiuThue + " VND");
        System.out.println("Thue suat: " + (thueSuat * 100) + "%");
        System.out.println("Tien thue thu nhap ca nhan phai tra: " + thuePhaiTra + " VND");
    }
}