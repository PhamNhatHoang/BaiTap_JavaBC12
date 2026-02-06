package baiTap_buoi3;

import java.util.Scanner;

public class bau6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double RATE = 23500; // VND cho 1 USD

        System.out.print("Nhap so USD: ");
        double usd = sc.nextDouble();

        double vnd = usd * RATE;
        System.out.println("So tien VND = " + vnd + " d");
    }
}
