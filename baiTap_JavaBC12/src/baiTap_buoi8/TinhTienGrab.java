package baiTap_buoi8;

import java.util.Scanner;

public class TinhTienGrab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn loại xe:");
        System.out.println("1. GrabCar");
        System.out.println("2. GrabSUV");
        System.out.println("3. GrabBlack");

        int loaiXe = sc.nextInt();

        System.out.print("Nhập số km đã đi: ");
        double km = sc.nextDouble();

        System.out.print("Nhập thời gian chờ (phút): ");
        int cho = sc.nextInt();

        double tongTien = 0;

        switch (loaiXe) {

            case 1: // GrabCar
                tongTien += tinhTienKm(km, 8000, 7500, 7000);
                tongTien += tinhTienCho(cho, 2000);
                break;

            case 2: // GrabSUV
                tongTien += tinhTienKm(km, 9000, 8500, 8000);
                tongTien += tinhTienCho(cho, 3000);
                break;

            case 3: // GrabBlack
                tongTien += tinhTienKm(km, 10000, 9500, 9000);
                tongTien += tinhTienCho(cho, 3500);
                break;

            default:
                System.out.println("Loại xe không hợp lệ");
                return;
        }

        System.out.println("Tổng tiền phải trả: " + tongTien + " VND");
    }

    // Tính tiền km
    public static double tinhTienKm(double km, int giaDau, int gia1Den19, int giaSau19) {

        double tien = 0;

        if (km <= 1) {
            tien = km * giaDau;
        } 
        else if (km <= 19) {
            tien = giaDau + (km - 1) * gia1Den19;
        } 
        else {
            tien = giaDau + 18 * gia1Den19 + (km - 19) * giaSau19;
        }

        return tien;
    }

    // Tính tiền chờ
    public static double tinhTienCho(int phutCho, int giaMoi3Phut) {

        if (phutCho <= 3) return 0;

        int soLan = (phutCho - 3) / 3;
        return soLan * giaMoi3Phut;
    }
}
