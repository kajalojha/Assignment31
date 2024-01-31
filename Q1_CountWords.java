package D4_Assignment;
import java.util.Scanner;
public class Q1_CountWords
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string ");
    String str = sc.nextLine();
       // String str = "Avi sofy cmck";
    int c=1;
    for(int i = 0 ; i<str.length() ; i++)
    {
     char ch = str.charAt(i);
        if (ch == ' ')
        {
            c++;
        }

    }

        System.out.println(" the count of words are : " + c);
    }


}
