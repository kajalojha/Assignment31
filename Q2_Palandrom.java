package D4_Assignment;
import java.util.Scanner;
public class Q2_Palandrom
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        String arr[] = str.split(" ");
        String s = "";
        for(int i=0;i<str.length();i++)
        {
              String g = arr[i];
            for(int j =g.length()-1 ;j>=0;j--)
            {
               s =  s + g.charAt(j);
            }
            if(s.equals(str))
            {
                System.out.println("true");
                break;

            }
            else{
                System.out.println("false");
                break;
            }
        }




    }

}
