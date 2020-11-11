public class removeUniqueChar {
    public static void main(String[] args) {
        String word = "abcaabcade";
        String nonDup = "";


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                char eachChar = word.charAt(j);

                if(ch==eachChar){
                    count++;
                }
            }
            if(nonDup.contains(ch+"")){
                continue;
            }else{
                nonDup+=ch+""+count;
            }
        }
        System.out.println(nonDup);




    }
}
