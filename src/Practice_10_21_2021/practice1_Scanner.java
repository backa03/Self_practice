package Practice_10_21_2021;

import java.util.Scanner; //this CLASS used for importing the sources from outside packages

public class practice1_Scanner {
    public static void main(String[] args) { // Scanner is used for getting user input
        Scanner input = new Scanner(System.in); // Object


        System.out.println("Please enter your score");
        int score = input.nextInt();
        String grade = " ";

        if(score>=0 && score <=100){
            if(score>=90) {
                grade="A";
                System.out.println("Your grade is: "+grade);
            }else if(score>=80){
                grade = "B";
                System.out.println("Your grade is: "+grade);
            }else if (score>=70){
               grade = "C";
                System.out.println("Your grade is: "+grade);
            }else if (score>=60){
                grade = "D";
                System.out.println("Your grade is: "+grade);
            }else{
                grade = "F";
                System.out.println("Your grade is: "+grade);
            }


        }else{
            System.out.println("Invalid Score ");
        }




    }
}
