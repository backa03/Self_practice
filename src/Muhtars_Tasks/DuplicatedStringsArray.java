package Muhtars_Tasks;

public class DuplicatedStringsArray {
    public static void main(String[] args) {
            String[] words = {"now", "wow","now","wow","bow","low","wow"};
            String duplicated = "";

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    count++;
                }

            }
            if(count>1){
                duplicated+=words[i]+" ";
            }
        }
        System.out.println(duplicated);

    }
}
