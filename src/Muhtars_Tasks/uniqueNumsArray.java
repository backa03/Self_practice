package Muhtars_Tasks;

public class uniqueNumsArray {
    public static void main(String[] args) {

        int[]  nums = {1,1,2,4,5,6,1,1,2,10};
        String unique ="";

        for (int i = 0; i < nums.length; i++) {
            int count = 0;


            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                unique+=nums[i]+" ";
            }



        }


        System.out.println(unique);





    }
}
/*
 1. write a program that can find the unique numbers from an integer array

 */