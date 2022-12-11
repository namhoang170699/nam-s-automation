package lab_02;

import java.util.Scanner;

public class lab_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay dien mot con so");
        float aNumber = scanner.nextFloat();

        if (aNumber % 2 == 0) {
            System.out.printf("%f la so chan", aNumber);
        } else {
            System.out.printf("%f la so le", aNumber);
        }
    }
}
