import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int numOfDice;
    int total = 0;

        System.out.println("Enter the number of dice to roll: ");
        numOfDice = sc.nextInt();

        if(numOfDice > 0){

            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("you rolled " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);

        }else{
            System.out.println("# of dice must be greater than 0");
        }


    sc.close();
    }
    static void printDie(int roll){
        String dice1 = """
                -----
                |   |
                | o |
                |   |
                -----
                """;

        String dice2 = """
                -----
                |o  |
                |   |
                |  o|
                -----
                """;
        String dice3 = """
                -----
                |o  |
                | o |
                |  o|
                -----
                """;
        String dice4 = """
                -----
                |o o|
                |   |
                |o o|
                -----
                """;
        String dice5 = """
                -----
                |o o|
                | o |
                |o o|
                -----
                """;
        String dice6 = """
                -----
                |o o|
                |o o|
                |o o|
                -----
                """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");

        }
    }


}
