package Practice_11_04_2020;

import java.util.Scanner;

public class unique_Chars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String un = "";
        String duplicated = "";

        //bd


        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);
            int count = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    count++;
                }

            }
            if (count == 1) {
                un += ch;
            }
            if( count>1&&!duplicated.contains(ch+"")){//removes extra characters
                duplicated+=ch;

            }

        }
        System.out.println(un);
        System.out.println(duplicated);
    }
}
