package StringLoopPractice;

public class frequencyOfCharacter {
    public static void main(String[] args) {

        String word = "AAAAAABBBBBBBCCCCCDDDDDAAAAA";

        char ch = 'A';

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char eachChar = word.charAt(i);
            if(eachChar==ch){   //if eachChar is equal to the ch
                count++;    //count will be increased by 1
            }

        }

        System.out.println(count);

    }
}
