import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        int lottery = (int) (Math.random() * 100);

        //System.out.println(lottery);
        int all_matches = 10000;
        int all_digits = 3000;
        int one_digit = 1000;


        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the three lottery number: ");
        int user_guess = userInput.nextInt();
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery / 10;
        int lotteryDigit3 = lottery % 10;

        int guessDigits1 = user_guess / 100;
        int guessDigits2 = user_guess / 10;
        int guessDigits3 = user_guess % 10;


        if (user_guess == lottery) {
            System.out.println(user_guess + " Congrats you won 10.000$ " + " The lottery number was: " + lottery);
        } else if (guessDigits1 == lotteryDigit2 && guessDigits2 == lotteryDigit3 && guessDigits3 == lotteryDigit1) {
            System.out.println(user_guess+ " Matched all the digits, you won 3.000$ " + " The lottery number was: " + lottery);
        } else if (guessDigits1 == lotteryDigit1 || guessDigits2 == lotteryDigit2 || guessDigits3 == lotteryDigit3) {
            System.out.println(user_guess+ " Good matched one digit, you won 1.000$ " + " The lottery number was: " + lottery);
        } else {
            System.out.println("Sorry " + "The lottery number was " + lottery + " Try again...");
        }

    }
}
