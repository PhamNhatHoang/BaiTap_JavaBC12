package baiTap_buoi6;

import java.util.Scanner;

public class Bai5_TietKiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tien gui ban dau P: ");
        double P = sc.nextDouble();

        System.out.print("Nhap so tien muon co trong tuong lai T: ");
        double T = sc.nextDouble();

        System.out.print("Nhap lai suat (%/nam), vd 7.5: ");
        double rPercent = sc.nextDouble();

        if (P <= 0 || T <= 0 || rPercent < 0) {
            System.out.println("Du lieu khong hop le!");
            return;
        }

        if (P >= T) {
            System.out.println("Khong can cho doi, vi P da >= T. So nam = 0");
            return;
        }

        double r = rPercent / 100.0;
        int years = 0;
        double money = P;

        while (money < T) {
            money = money * (1 + r);
            years++;
        }

        System.out.println("So nam it nhat can cho: " + years);
        System.out.println("So tien sau " + years + " nam: " + money);
    }
}
