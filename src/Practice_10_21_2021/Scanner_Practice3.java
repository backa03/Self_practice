package Practice_10_21_2021;

import java.util.Scanner;

public class Scanner_Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your gender: ");
        String gender = input.next();

        System.out.println("Please enter your age: ");
        byte age = input.nextByte();

        input.nextLine();//absorbs Enters

        System.out.println("Please enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Please enter your zip-code: ");
        int zipcode = input.nextInt();

        input.nextLine();// u need only if after scanner method you are using nextLine method

        System.out.println("Please enter your Country name: ");
        String county = input.nextLine();

        System.out.println("Please enter your salary: ");
        double salary = input.nextDouble();//80000Enter -- ignoring the Enter

        input.nextLine(); // use empty nextLine method to absorb enter everytime before declaring another var.nextLine

        System.out.println("Please enter your company name: ");
        String company = input.nextLine();

        System.out.println("Please enter your address: ");
        String address = input.nextLine();










    }
}
