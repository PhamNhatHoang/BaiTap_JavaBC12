package baiTap_buoi6;

import java.util.Random;
import java.util.Scanner;

public class Bai1_OanTuTi {
    // 1=Bao, 2=Keo, 3=Kim
    static String ten(int x) {
        switch (x) {
            case 1: return "Bao";
            case 2: return "Keo";
            case 3: return "Kim";
            default: return "Khong hop le";
        }
    }

    // trả về: 0 hòa, 1 người thắng, -1 máy thắng
    static int ketQua(int nguoi, int may) {
        if (nguoi == may) return 0;
        // Người thắng: Bao(1) > Kim(3), Keo(2) > Bao(1), Kim(3) > Keo(2)
        if ((nguoi == 1 && may == 3) || (nguoi == 2 && may == 1) || (nguoi == 3 && may == 2)) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int win = 0, lose = 0, draw = 0;

        while (true) {
            System.out.print("Nhap lua chon (1=Bao, 2=Keo, 3=Kim, 0=Dung): ");
            int nguoi = sc.nextInt();
            if (nguoi == 0) break;

            if (nguoi < 1 || nguoi > 3) {
                System.out.println("Nhap sai! Hay nhap 1-3 hoac 0 de dung.");
                continue;
            }

            int may = rd.nextInt(3) + 1;

            System.out.println("Ban: " + ten(nguoi) + " | May: " + ten(may));

            int kq = ketQua(nguoi, may);
            if (kq == 1) { win++; System.out.println("=> Ban THANG!"); }
            else if (kq == -1) { lose++; System.out.println("=> May THANG!"); }
            else { draw++; System.out.println("=> HOA!"); }

            System.out.println("-------------------");
        }

        System.out.println("Tong ket: Ban thang " + win + ", thua " + lose + ", hoa " + draw);
        if (win > lose) System.out.println("Chung cuoc: BAN THANG (ti so " + win + "-" + lose + ")");
        else if (lose > win) System.out.println("Chung cuoc: MAY THANG (ti so " + lose + "-" + win + ")");
        else System.out.println("Chung cuoc: HOA (ti so " + win + "-" + lose + ")");
    }
}
