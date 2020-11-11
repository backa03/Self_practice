package Muhtars_Tasks;

public class uniqueStringsArray {
    public static void main(String[] args) {
        String[] words = {"wow","how", "now","wow","now","bow"};

        String unique = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                String eachWord = words[j];
                if(word.equals(eachWord)){
                    count++;
                }
            }
            if(count==1){
                unique+=word+" ";
            }

        }

        System.out.println(unique);


    }
}