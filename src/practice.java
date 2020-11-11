public class practice {
    public static void main(String[] args) {

        String word = "ababababab";

        String letter = "a";

        int count = 0;

        for(int i = 0;i<word.length();i++){

            if(word.contains(letter)){
                word=word.replaceFirst("a","");
                count++;
            }


        }
        System.out.println(count);


    }
}
