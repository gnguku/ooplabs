import java.util.Scanner;
 
public class GetNameGender
{
    public static void main(String args[])
    {
        String name, gender;
               
        Scanner s = new Scanner(System.in);
         
        System.out.print("Please enter your name: ");
        name= s.nextLine();
         
        System.out.print("Please enter your gender (M/F): ");
        gender=s.next();
 
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
                                        
    }
}