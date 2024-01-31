package D4_Assignment;

public class Q5_Remove_Duplicate
{
public static void main(String[] args){
    String str = " aaabb";
   char firstch = str.charAt(0);
   String g = String.valueOf(firstch);
    System.out.println(firstch);
     for(int i=1 ;i<str.length() ;i++)
     {
         char ch1 = str.charAt(i);
         char ch2 = str.charAt(i-1);
         if(ch1==ch2)
         {
             continue;
         }
         else if(ch1!=ch2)
         {
            g = g+ch1;
         }

     }
    System.out.println(g);
}
}
