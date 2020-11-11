package Practice_11_04_2020;

public class freqOfChars {
    public static void main(String[] args) {
        String word = "abbacaa";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                char eachCh = word.charAt(j);
                if(ch==eachCh){
                    count++;
                }
            }
       if(!result.contains(ch+""))
            result+=ch+""+count;
        }


        System.out.println(result);
    }
}
