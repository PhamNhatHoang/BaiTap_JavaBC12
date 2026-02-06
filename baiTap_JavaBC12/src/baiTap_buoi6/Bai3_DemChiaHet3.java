package baiTap_buoi6;

public class Bai3_DemChiaHet3 {
    public static void main(String[] args) {

        // DUNG FOR
        int countFor = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                countFor++;
            }
        }
        System.out.println("So luong so chia het cho 3 (for) = " + countFor);

        // DUNG WHILE
        int countWhile = 0;
        int i = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                countWhile++;
            }
            i++;
        }
        System.out.println("So luong so chia het cho 3 (while) = " + countWhile);
    }
}
