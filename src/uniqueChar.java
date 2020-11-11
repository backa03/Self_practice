import java.util.Scanner;

public class uniqueChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = "abcaabcade";

        String result = "";


        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char ch = word.charAt(i);

            for (int j = 0; j < word.length(); j++) {
                char eachChar = word.charAt(j);

                if (ch == eachChar) {
                    count++;
                }
            }

            if (count == 1) {
                result += ch;
            }


        }

        System.out.println(result);
    }
}
