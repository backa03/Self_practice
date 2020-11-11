package Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int[] scores = new int[5];
        scores[0]=10;
        scores[1]=20;
        scores[2]=50;
        scores[3]=30;
        scores[4]=40;

        System.out.println(Arrays.toString(scores));

       // for (int i = 0; i < scores.length; i++) {
       //     System.out.println(scores[i]);
       //
       // }

       for(int each: scores){
           System.out.println(each);
       }
        //now








    }

}
