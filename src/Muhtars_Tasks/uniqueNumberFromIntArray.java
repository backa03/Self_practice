package Muhtars_Tasks;

public class uniqueNumberFromIntArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,4};
        String nums = "";

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count==1){
                nums+=arr[i]+" ";
            }
        }
        System.out.println("nums = " + nums);

    }
}
