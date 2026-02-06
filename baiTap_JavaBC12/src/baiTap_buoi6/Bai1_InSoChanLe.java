package baiTap_buoi6;

public class Bai1_InSoChanLe {
    public static void main(String[] args) {

        // SO CHAN - FOR + BUOC NHAY
        System.out.println("So chan < 100 (for + buoc nhay):");
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }

        // SO CHAN - WHILE + BUOC NHAY
        System.out.println("\n\nSo chan < 100 (while + buoc nhay):");
        int i = 2;
        while (i < 100) {
            System.out.print(i + " ");
            i += 2;
        }

        // SO CHAN - FOR + %
        System.out.println("\n\nSo chan < 100 (for + %):");
        for (int j = 1; j < 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

        // SO CHAN - WHILE + %
        System.out.println("\n\nSo chan < 100 (while + %):");
        int j = 1;
        while (j < 100) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }

        // SO LE - FOR + BUOC NHAY
        System.out.println("\n\nSo le < 100 (for + buoc nhay):");
        for (int k = 1; k < 100; k += 2) {
            System.out.print(k + " ");
        }

        // SO LE - WHILE + BUOC NHAY
        System.out.println("\n\nSo le < 100 (while + buoc nhay):");
        int k = 1;
        while (k < 100) {
            System.out.print(k + " ");
            k += 2;
        }
        
        // SO LE - FOR + %
        System.out.println("\n\nSo le < 100 (for + %):");
        for (int m = 1; m < 100; m++) {
            if (m % 2 != 0) {
                System.out.print(m + " ");
            }
        }

        // SO LE - WHILE + %
        System.out.println("\n\nSo le < 100 (while + %):");
        int m = 1;
        while (m < 100) {
            if (m % 2 != 0) {
                System.out.print(m + " ");
            }
            m++;
        }
    }
}
