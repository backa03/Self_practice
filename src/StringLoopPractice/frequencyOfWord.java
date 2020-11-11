package StringLoopPractice;

public class frequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Cat Cat Cat Cat Cat";
        String word = "Cat";

        int count = 0;

        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");// while sentence still contains word you wanna count it's gonna replace it with empty space
            count++;//and count =+1;
        }
        System.out.println(count);




    }
}
