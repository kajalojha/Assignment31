package D4_Assignment;
import java.util.*;
public class Q8_compressTheString
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        String ans = "" + str.charAt(0);
        int count = 1;
        for(int i=1;i<n;i++){
            if(str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }else{
                ans+=count ;
                ans+=str.charAt(i);
                count = 1;
            }
        }
        ans+=count;
        System.out.println(ans);

    }

}
