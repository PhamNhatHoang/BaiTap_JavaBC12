package baiTap_buoi6;

public class Bai2_TimN {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;

        while (sum <= 10000) {
            n++;
            sum += n;
        }

        System.out.println("n nho nhat: " + n);
        System.out.println("Tong = " + sum);
    }
}

