package baiTap_buoi5;

import java.util.Scanner;

public class Bai2_XepLoaiSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap diem Toan: ");
        double toan = sc.nextDouble();

        System.out.print("Nhap diem Ly: ");
        double ly = sc.nextDouble();

        System.out.print("Nhap diem Hoa: ");
        double hoa = sc.nextDouble();

        // Process
        double tb = (toan + ly + hoa) / 3;
        String xepLoai;

        if (tb >= 8.5) {
            xepLoai = "Gioi";
        } else if (tb >= 6.5) {
            xepLoai = "Kha";
        } else if (tb >= 5) {
            xepLoai = "Trung binh";
        } else {
            xepLoai = "Yeu";
        }

        // Output
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Diem trung binh: " + tb);
        System.out.println("Xep loai: " + xepLoai);
    }
}
