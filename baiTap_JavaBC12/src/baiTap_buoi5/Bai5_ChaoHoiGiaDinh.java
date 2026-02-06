package baiTap_buoi5;

import java.util.Scanner;

public class Bai5_ChaoHoiGiaDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ai dang su dung may? (B=Bo, H=Me, A=Anh trai, E=Em gai): ");
        String s = sc.nextLine().trim().toUpperCase();

        if (s.isEmpty()) {
            System.out.println("Ban chua nhap gi ca!");
            return;
        }

        char ch = s.charAt(0);
        switch (ch) {
            case 'B':
                System.out.println("Con chao bo a! Bo dung may vui ve nhe!");
                break;
            case 'H':
                System.out.println("Con chao me a! Me dung may can than nha!");
                break;
            case 'A':
                System.out.println("Chao anh trai! Chuc anh hoc/giai tri vui ve!");
                break;
            case 'E':
                System.out.println("Chao em gai! Chuc em mot ngay that vui!");
                break;
            default:
                System.out.println("Khong dung ma (chi nhan B/H/A/E).");
        }
    }
}
