import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String answer = "";
        do{
            System.out.println("Please enter num1");
            int num1 = input.nextInt();
            System.out.println("Please enter operator:");
            String operator = input.next();
            System.out.println("Please enter num2:");
            int num2 = input.nextInt();

            switch (operator){
                case"*":
                    System.out.println(num1*num2);
                    break;
                case"+":
                    System.out.println(num1+num2);
                    break;
                case"-":
                    System.out.println(num1-num2);
                    break;
                case"/":
                    System.out.println(num1/num2);
                    break;
                case"%":
                    System.out.println(num1%num2);
                default:
                    System.out.println("Invalid operator");

            }
            System.out.println("Would you like to continue?");

            input.nextLine();
            answer+=input.nextLine();
            //String answer = input.nextLine();

        }while(answer.equalsIgnoreCase("yes"));




    }
}
/* Calculator
         1. Addiition, subctraction, multiplication, devision, remainder
         would you like to continue? Yes, No
*/