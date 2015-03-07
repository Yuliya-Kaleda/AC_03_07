package nyc.c4q.yuliyakaleda;

/**
 * Created by olgakoleda on 3/7/15.
 */
import java.util.Scanner;

public class fortune_teller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You have 5 questions to ask. Ask your first question that starts with ' Will I..?:'");
        input.nextLine();
        System.out.println("Maybe. Ask another question: ");

        input.nextLine();
        System.out.println("Definitely. Ask your third question:");

        input.nextLine();
        System.out.println("Sorry, it will not happen! Ask your forth question: ");

        input.nextLine();
        System.out.println("Only God knows! Ask your last question: ");

        input.nextLine();
        System.out.println("Pray and it will happen:) Your limit of questions is up. Happy Life!");

    }
}
