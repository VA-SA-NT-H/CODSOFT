package com.mycompany.random.number.generator;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator
{
    static int final_score = 0, score = 0;
    static void rand_num()
        {
        
            Random random = new Random();
            Scanner in = new Scanner(System.in);
            
            int total_attempts = 5;
            int attempt=0;
            int Random_number = random.nextInt(100);
        
            System.out.println("NUMBER GUESSSING GAME (1-100)");
            System.out.println("\nYou have 5 attempts to guess a number.");
            do
            {
                System.out.print("\nGuess the number : ");
                int number = in.nextInt();
        
                if(number == Random_number)
                {
                    System.out.println("\nYou guessed the number!");
                    score++;
                    final_score += score;
                    System.out.println("\n Your score : "+ score);
                    break;
                }
                else if(number > Random_number)
                {
                    System.out.println("Too high!");
                    attempt++;
                    System.out.println("\nRemaining attempts : "+ (total_attempts - attempt));
                }
                else
                {
                    System.out.println("Too low!");
                    attempt++;
                    System.out.println("\nRemaining attempts : "+ (total_attempts - attempt));
                } 
                if(attempt == 5)
                {
                    System.out.println("Correct answer is "+ Random_number);
                    System.out.println("\n YOUR SCORE : "+ score);
                }
                
            }while(attempt<5);
    }
    public static void main(String[] args)
    { 
        Scanner in = new Scanner(System.in);
        char user_input;     
        
        do
        {         
            rand_num();
            System.out.print("\nContinue the game (Y / N): ");
            user_input = in.next().charAt(0);
            
            if(user_input == 'N' || user_input == 'n')
            {
                System.out.print("Final score : "+ final_score);
                System.out.println("\nThank you for playing...");
                break;
            }
        }while(user_input == 'Y' || user_input == 'y');
    }
        
  }

