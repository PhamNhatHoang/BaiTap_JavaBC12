package baiTap_buoi3;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh goc vuong a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap canh goc vuong b: ");
        double b = sc.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        System.out.println("Canh huyen c = " + c);
    }
}
