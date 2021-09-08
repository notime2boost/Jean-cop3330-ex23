package Ex23;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key?");
        String ans = input.next();

             if(ans.equals("y")) {
                 System.out.println("Are the battery terminals corroded?");
                 String ans1 = input.next();
                 if (ans1.equals("y")) {
                     System.out.println("clean terminals and try starting again");
                     System.exit(0);
                 }
                 else {
                     System.out.println("Replace cables and try again.");
                     System.exit(0);
                 }
             }
             else{
                System.out.println("Does the car make a slicking noice?");
                String ans2 = input.next();
                if(ans2.equals("y")){
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else{
                    System.out.println("Does the engine start and then die?");
                    String ans3 = input.next();
                    if(ans3.equals("y")){
                        System.out.println("Does you car have fuel injection?");
                        String ans4 = input.next();
                        if(ans4.equals("y")){
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing");
                            System.exit(0);
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }

            }
         }
    }

