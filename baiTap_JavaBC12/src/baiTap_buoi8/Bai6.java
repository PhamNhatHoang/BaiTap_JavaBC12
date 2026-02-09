package baiTap_buoi8;

import java.util.Scanner;

public class Bai6 {

    // CT diện tích
    public static double tinhDienTich(double canh) {
        return canh * canh;
    }

    // CT chu vi
    public static double tinhChuVi(double canh) {
        return 4 * canh;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều rộng (cạnh) hình vuông: ");
        double canh = sc.nextDouble();

        double dienTich = tinhDienTich(canh);
        double chuVi = tinhChuVi(canh);

        System.out.println("Diện tích hình vuông là: " + dienTich);
        System.out.println("Chu vi hình vuông là: " + chuVi);
    }
}
