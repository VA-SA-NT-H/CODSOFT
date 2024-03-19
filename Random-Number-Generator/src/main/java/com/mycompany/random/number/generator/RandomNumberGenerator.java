package com.mycompany.random.number.generator;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator
{
    public static void main(String[] args)
    {    
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        
        int total_attempts = 5;
        int attempt=0;
        int Random_number = random.nextInt(100);
        
        System.out.println("You have 5 attempts to guess a number.");
        do
        {
            System.out.print("\nGuess the number : ");
            int number = in.nextInt();
        
            if(number == Random_number)
            {
                System.out.println("\nYou guessed the number!");
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
        }while(attempt<5);
    }
}
