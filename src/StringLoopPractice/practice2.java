package StringLoopPractice;

public class practice2 {
    public static void main(String[] args) {

        String word = "ababababa";

        String letter = "a";

        int count = 0;

        while(word.contains(letter)){
            word=word.replaceFirst("a","");
            count++;



        }
        System.out.println(count);

    }
}
