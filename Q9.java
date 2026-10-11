import java.util.*;
public class Q9 {
    public static boolean isPrime(int x)
    {
        if(x < 2)
            return false;
        for(long i = 2; i * i <= x; i++)
        {
            if(x % i == 0)
                return false;
        }
        return true;
    }

    public static int nextPrime(int n)
    {
        if(n < 2)
            return 2;
        int check = n + 1;
        while(!isPrime(check))
        {
            check++;
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = nextPrime(n);
        System.out.println(result);
        sc.close();
    }
}