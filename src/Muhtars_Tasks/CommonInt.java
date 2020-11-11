package Muhtars_Tasks;

public class CommonInt {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {4, 5, 6, 7, 8};


        for (int i = 0; i < num1.length; i++) {
            int eachNum = num1[i];
            int count = 1;
            for (int j = 0; j < num2.length; j++) {
                if(eachNum==num2[j]){
                    count++;
                  //  System.out.print(eachNum+" ");
                }

            }
        if(count>1){
            System.out.print(eachNum+" ");
        }

        }










    }
}

