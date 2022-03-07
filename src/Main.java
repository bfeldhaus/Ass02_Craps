import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        char response;
        Scanner in = new Scanner(System.in);

        do
        {
            System.out.println("Press ENTER to roll the dice...");
            in.nextLine();

            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int rollTotal = roll1 + roll2;
            System.out.println("You rolled a " + roll1 + " and a " + roll2);
            System.out.println("for a total of " + rollTotal);

            if (rollTotal == 7 | rollTotal == 11)
            {
                System.out.println("You won!");
            }
            else if (rollTotal == 2 | rollTotal == 3 | rollTotal == 12)
            {
                System.out.println("You lose!");
            }
            else
            {
                int point = rollTotal;

                boolean keepPlaying = true;

                while (keepPlaying)
                {
                    System.out.println("Press ENTER to roll the dice...");
                    in.nextLine();

                    roll1 = d1.roll();
                    roll2 = d2.roll();
                    rollTotal = roll1 + roll2;
                    System.out.println("You rolled a " + roll1 + " and a " + roll2);
                    System.out.println("for a total of " + rollTotal);

                    if (rollTotal == point)
                    {
                        System.out.println("You matched your point. You win!");
                        keepPlaying = false;
                    }
                    else if (rollTotal == 7)
                    {
                        System.out.println("You rolled a 7. You lose!");
                        keepPlaying = false;
                    }
                }
            }
            System.out.println("Would you like to play again (Y/N?)");
            response = in.next().charAt(0);
        } while(response == 'Y');
    }
}

