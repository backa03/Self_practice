public class nestedLoop {
    public static void main(String[] args) {

        for(int j =0; j<=4;j++){
            int k = 0;
            while(k<50){
                System.out.print(" |Row"+j+"-Column"+k);
                k++;
            }
            System.out.println();
        }
    }
}
