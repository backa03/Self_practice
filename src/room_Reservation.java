import java.util.Scanner;

public class room_Reservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPrice = 0;


        System.out.println("King bed = 120$");
        System.out.println("Queen bed = 100$");
        System.out.println("Single bed = 80$");


        while(true) {
            System.out.println("Which bed you wanna reserve?");
            String bed = input.nextLine();


            if (bed.equalsIgnoreCase("king bed")) {
                totalPrice += 120;
            } else if (bed.equalsIgnoreCase("queen bed")) {
                totalPrice += 100;
            } else if (bed.equalsIgnoreCase("Single bed")) {
                totalPrice += 80;
            } else {
                System.out.println("Invalid entry, please Re-enter");
                continue;
            }

            System.out.println("Do you wanna reserve another room?");
            String answer = input.next();
            input.nextLine();
            if(answer.equalsIgnoreCase("no")){
                break;
            }


            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){

                System.out.println("Invalid answer, please re-entry:");
                answer = input.next();
        input.nextLine();
            }


        }

        System.out.println(totalPrice);

    }
}
/*         A, King Bed ==> 120$
           B,  Queen Bed ==> 100$
           C,  single Bed ==> 80$
    the program asks the user which bedroom does he/she wants to reserve and calculates the total price, and then the program will ask:
        do you want to reserve another room:
                    if yes ==> repeat the previous steps
                    if no ==> your total price is: $$$
                    while answer is neither yes or no ==> please re-enter
    HINT: nested loop task, outer loop need to be an infinite loop

 */