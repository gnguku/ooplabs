import java.util.Scanner;

public class NumberGame {

  public static void main(String[] args)
  boolean continue = true

  {
     int num;
     System.out.println("Enter a number between 1 and 5");

     Scanner input = new Scanner(System.in);
     num = input.nextInt();

     while(continue == true){

	 if ( num % 2 == 0 && 1<=num<=5)
        System.out.println("Lucky Guess");

	else if (num < 5)
        System.out.println("The number should be between 1 and 5");

       else
        System.out.println("Better Luck Next Time");

     System.out.println("Would you love to try again? (reply y for YES and n for NO)");
     if (continue = 'y')
        continue = true
     else continue = false
        }
      }
  }