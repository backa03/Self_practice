package StringLoopPractice;

import java.util.Scanner;

public class reverseTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();

        String reverse = "";


        for (int i =word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);

        }
        System.out.print(reverse);








    }
}
