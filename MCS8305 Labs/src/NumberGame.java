import java.util.Scanner;

class NumberGame
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter a number between 1 and 5");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if ( num % 2 == 0 )
        System.out.println("Lucky Guess");
     else
        System.out.println("Better Luck Next Time");
  }
}