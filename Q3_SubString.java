package D4_Assignment;

import java.util.Scanner;

public class Q3_SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        String g = "";
        for (int i = 0; i < str.length(); i++)
        {
            for(int j= i; j<str.length() ;j++){
               g =  g + str.charAt(j);
               System.out.println(g);
            }
            g = "";
        }

    }
}
