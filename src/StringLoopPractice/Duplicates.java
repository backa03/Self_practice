package StringLoopPractice;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter words");
        String word = input.nextLine();


        String nonDupl = "";

        for (int i = 0; i < word.length(); i++) {
            String eachChar = ""+word.charAt(i);

            if(nonDupl.contains(eachChar)){//if the char already contains in nonDupl
                continue;//skip it
            }else{
                nonDupl+=eachChar;//otherwise nonDupl = nonDupl+word.charAt(i)
            }

        }

        System.out.println(nonDupl);







    }
    }