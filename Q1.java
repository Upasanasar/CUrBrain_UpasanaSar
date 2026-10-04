import java.util.*;
public class Q1 {
    public static boolean hasEvenDigits(long n)
    {
        if (n==0)
            return false;
        else{
            int c = 0;
            while(n != 0)
            {
                c++;
                n = n/10;
            }
            return (c%2==0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long n = sc.nextLong();
        boolean result = hasEvenDigits(n);
        System.out.println(result);
        sc.close();
    }
}
