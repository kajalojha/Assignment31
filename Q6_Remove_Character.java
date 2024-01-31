package D4_Assignment;
import java.util.*;
//Problem statement
//For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
//
//The input string will remain unchanged if the given character(X) doesn't exist in the input string.
//
//Sample Input 1:
//aabccbaa
//        a
//Sample Output 1
public class Q6_Remove_Character
{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String s = sc.nextLine();
    System.out.println("enter the character");
    String x = sc.next();
   char x1 = x.charAt(0);
   String g = "";
   int count = 0;
   for(int i=0;i<s.length();i++)
   {
       if(x1==s.charAt(i) && count ==0){
          count++;
       }
       else if(x1!=s.charAt(i))
       {
           g = g+s.charAt(i);
       }
   }
    System.out.println(g);
}
}
