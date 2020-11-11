package Muhtars_Tasks;

public class uniqueWordsFromArray {
    public static void main(String[] args) {
        String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"};
        String unique = "";

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    count++;
                }

            }
            if(count==1){
                unique+=words[i]+" ";
            }
        }
        System.out.println(unique);




    }
}
