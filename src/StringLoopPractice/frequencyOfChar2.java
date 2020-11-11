package StringLoopPractice;

public class frequencyOfChar2 {
    public static void main(String[] args) {
        String word = "abababa";
        //
        String ch = "a";

        int count = 0;

        while (word.contains(ch)){
            word = word.replaceFirst(ch+"","");//checks every character and if its matching the condition removes it
            count++;

        }
        System.out.println(count);


    }
}
