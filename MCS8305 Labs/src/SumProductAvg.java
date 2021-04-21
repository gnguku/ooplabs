import java.util.Scanner;
 
public class SumProductAvg
{
    public static void main(String args[])
    {
        int num1, num2, num3, sum, product;
	double average;
     
	Scanner input=new Scanner(System.in);
         
        System.out.print("Please enter three integers. Enter the first number and press Enter");
        num1=input.nextInt();
         
        System.out.print("Please enter the second number and press Enter");
        num2=input.nextInt();
 
        System.out.print("Please enter the last number and press Enter");
        num3=input.nextInt();

	sum = num1 + num2 + num3;
	product = num1*num2*num3;
	average = sum/3;
 
        System.out.println("The sum of the three numbers is: " + sum);
        System.out.println("The product of the three numbers is: " + product);
        System.out.println("The average of the three numbers is: " + average);
                                          
    }
}