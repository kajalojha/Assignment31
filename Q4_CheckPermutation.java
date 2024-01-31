package D4_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_CheckPermutation
{
    public static void main(String[] args) {
        String  str1 = "kajal";
        String str2 = "lkaja";
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println( "String 1"  + str1);
        System.out.println( "String 2 " + str2);
        str1 = String.valueOf(arr1);
        str2 = String.valueOf(arr2);

        if((str1).equals(str2))
        {
            System.out.println(true);
        }



    }

}
