package T4;

import java.util.Scanner;

public class BmiMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        Double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        Double height = scanner.nextDouble();
        Bmi bmi = new Bmi(height,weight);
        System.out.println("BMI is "+bmi.getBmi());
        System.out.println(bmi.getInterpretation());
    }
}
