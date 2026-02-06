package baiTap_buoi5;

import java.util.Scanner;

public class Bai4_DocSo2ChuSo {
    static String docDonVi(int x) {
        switch (x) {
            case 0: return "khong";
            case 1: return "mot";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bon";
            case 5: return "nam";
            case 6: return "sau";
            case 7: return "bay";
            case 8: return "tam";
            case 9: return "chin";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so co 2 chu so (10..99): ");
        int n = sc.nextInt();

        if (n < 10 || n > 99) {
            System.out.println("Khong hop le! Hay nhap so tu 10 den 99.");
            return;
        }

        int chuc = n / 10;
        int donVi = n % 10;

        String ketQua = "";

        // 10..19
        if (chuc == 1) {
            if (donVi == 0) ketQua = "muoi";
            else if (donVi == 5) ketQua = "muoi lam";
            else ketQua = "muoi " + docDonVi(donVi);
        } else {
            // 20..99
            ketQua = docDonVi(chuc) + " muoi";

            if (donVi == 0) {
                // nothing
            } else if (donVi == 1) {
                ketQua += " mot"; // (có thể đọc "mốt" nếu muốn)
            } else if (donVi == 4) {
                ketQua += " bon"; // (có thể đọc "tư" nếu muốn)
            } else if (donVi == 5) {
                ketQua += " lam";
            } else {
                ketQua += " " + docDonVi(donVi);
            }
        }

        System.out.println("Cach doc: " + ketQua);
    }
}

