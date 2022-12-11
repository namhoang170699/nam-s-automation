package lab_02;

import java.util.Scanner;

public class lab_02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay dien can nang cua ban (kg)");
        float userWeight = scanner.nextFloat();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Hay dien chieu cao cua ban (m)");
        float userHeight = scanner2.nextFloat();


        float userBMI = userWeight / (userHeight * 2);

        if (userWeight > 0 && userHeight > 0) {


            if (userBMI < 18.5) {
                System.out.println("You are underweight");
                System.out.printf("You should increase %f kg", (18.5 * (userHeight * 2)) - userWeight);
            } else if (userBMI >= 18.5 && userBMI <= 24.9) {
                System.out.println("Your weight is normal");
            } else if (userBMI >= 25 && userBMI <= 29.9) {
                System.out.println("You are overweight");
                System.out.printf("You should decrease %f kg", Math.abs((24.9 * (userHeight * 2)) - userWeight));
            } else {
                System.out.println("You are so fat!!!");
                System.out.printf("You should decrease %f kg", Math.abs((24.9 * (userHeight * 2)) - userWeight));

            }
        } else {
            System.out.println("Can nang hoac chieu cao khong hop le");
        }
    }
}
