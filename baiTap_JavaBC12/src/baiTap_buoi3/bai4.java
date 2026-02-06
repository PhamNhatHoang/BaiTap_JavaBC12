package baiTap_buoi3;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 5;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            int x = sc.nextInt();
            sum += x; // toan tu +=
        }

        double avg = (double) sum / N; // ep kieu de tranh chia nguyen
        System.out.println("Trung binh = " + avg);

        sc.close();
    }
}
