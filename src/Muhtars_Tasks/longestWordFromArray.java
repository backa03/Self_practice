package Muhtars_Tasks;

public class longestWordFromArray {
    public static void main(String[] args) {

        String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Programmin"};
        String word = "a";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>=word.length()){
                word = words[i]+" ";
            }

        }
        System.out.println(word);
    }
}
