package Muhtars_Tasks;

public class duplicatedNumsArray {
    public static void main(String[] args) {
        int[] nums ={1,1,1,2,2,3,4,5,6,7,7,7,8,8};
        String dup = "";

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count>1){
                dup+=nums[i]+" ";
            }
        }

        System.out.println(dup);





    }

}
