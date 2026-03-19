package baiTap_buoi8;

import java.util.Scanner;

public class TinhTienGrabHoaDon {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CHUONG TRINH TINH TIEN GRAB =====");
        System.out.println("1. GrabCar");
        System.out.println("2. GrabSUV");
        System.out.println("3. GrabBlack");

        System.out.print("Chon loai xe: ");
        int loaiXe = sc.nextInt();

        System.out.print("Nhap so KM da di: ");
        double km = sc.nextDouble();

        System.out.print("Nhap thoi gian cho (phut): ");
        int cho = sc.nextInt();

        double tienKm = 0;
        double tienCho = 0;
        double tongTien = 0;

        double giaDau = 0;
        double gia1Den19 = 0;
        double giaSau19 = 0;
        double giaCho = 0;

        String tenXe = "";

        switch (loaiXe) {

            case 1:
                tenXe = "GrabCar";
                giaDau = 8000;
                gia1Den19 = 7500;
                giaSau19 = 7000;
                giaCho = 2000;
                break;

            case 2:
                tenXe = "GrabSUV";
                giaDau = 9000;
                gia1Den19 = 8500;
                giaSau19 = 8000;
                giaCho = 3000;
                break;

            case 3:
                tenXe = "GrabBlack";
                giaDau = 10000;
                gia1Den19 = 9500;
                giaSau19 = 9000;
                giaCho = 3500;
                break;

            default:
                System.out.println("Loai xe khong hop le");
                return;
        }

        // TINH TIEN KM

        if (km <= 1) {
            tienKm = km * giaDau;
        }
        else if (km <= 19) {
            tienKm = giaDau + (km - 1) * gia1Den19;
        }
        else {
            tienKm = giaDau + 18 * gia1Den19 + (km - 19) * giaSau19;
        }

        // TINH TIEN

        if (cho > 3) {
            int lanCho = (cho - 3) / 3;
            tienCho = lanCho * giaCho;
        }

        tongTien = tienKm + tienCho;

        // IN HOA DON

        System.out.println("\n===== HOA DON =====");
        System.out.println("Loai xe: " + tenXe);
        System.out.println("So KM: " + km);
        System.out.println("Tien KM: " + tienKm + " VND");
        System.out.println("Tien cho: " + tienCho + " VND");
        System.out.println("------------------------");
        System.out.println("Tong tien: " + tongTien + " VND");
	}
}
