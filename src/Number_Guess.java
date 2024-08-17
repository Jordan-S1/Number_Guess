import java.util.Scanner;
public class Number_Guess {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        // Generate the number
        int num = 1 + (int)(Math.random()*100);
        // Given N tries
        int N = 10;
        int i;
        int guess;

        System.out.println( "Guess a number between 1 to 100 within 10 tries.");

        // Iterate over N Tries
        for(i = 0; i < N; i++)
        {
            System.out.println( "Guess the number:");
            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed correctly
            if (num == guess)
            {
                System.out.println( "Congratulations! You guessed the correct number.");
                break;
            }
            //If the number guessed is smaller than actual
            else if (num > guess && i != N - 1)
            {
                System.out.println("The actual number is greater than " + guess);
            }
            //If the number guessed is larger than actual
            else if (num < guess && i != N - 1)
            {
                System.out.println("The actual number is less than " + guess);
            }
        }
        //if tried all N times and still not guess correctly
        if (i == N)
        {
            System.out.println("You have used up all 10 tries.");
            System.out.println("The actual number was " + num);
        }
    }

}