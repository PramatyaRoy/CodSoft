import java.util.*;24

import java.lang.Math;

class number_game

{

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        int max = 100, min = 1, range = max - min + 1, score = 10, i;

        int rand = (int)(Math.random() * range) + min;

        System.out.println("Guess a number from 1 to 100");

        for(i=1;i<=5;i++)

        {

            System.out.print("Attempt "+i+" - Guess the number : ");

            int user_guess = sc.nextInt();

            if(user_guess == rand)

            {

                System.out.println("Hurray! You won :D\nYour score is : "+score);

                break;

            }

            else if((i != 5) && (rand > user_guess))

            {

                score-=2;

                System.out.println("Incorrect guess\nYour score is : "+score+"\nHint: Your guess is lower than the expected");

            }

            else if((i != 5) && (rand < user_guess))

            {

                score-=2;

                System.out.println("Incorrect guess\nYour score is : "+score+"\nHint: Your guess is higher than the expected");

            }

            if((i == 5) && (user_guess != rand))

            {    

                score-=2;

                System.out.println("You lose! Game Over XD\nYour score is : "+score);

            }

        }

    }

}