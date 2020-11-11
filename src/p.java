import java.util.Scanner;
public class p {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String way = "ABCD";
        String instr = "";



        for(int i =way.indexOf(start);i == way.indexOf(end);i++){
           // if(start.equals(end)){
             //   System.out.println(start+" found");
                if(i==0){
                    instr+="right >";
                }else if(i==1){
                    instr+="down >";
                }else if(i==2){
                    instr+="left >";
                }else if(i==3){
                    instr+="up >";
                }




         //   }



        }
        System.out.println(instr);
    }
}