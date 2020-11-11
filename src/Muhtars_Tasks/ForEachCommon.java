package Muhtars_Tasks;

public class ForEachCommon {
    public static void main(String[] args) {

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {4,5,6,7,8};


        for(int each :num1){
            for(int each1:num2){
                if(each==each1){
                    System.out.print(each+" ");
                }

            }
        }

    }
}
