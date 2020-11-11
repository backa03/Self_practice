package Practice_11_04_2020;

import java.util.Scanner;

public class freqOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.next();
        int count = 0;

        System.out.println("Enter a char");
        char ch = input.next().charAt(0);
        input.close();
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);


    }
}