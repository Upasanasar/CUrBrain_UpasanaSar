import java.util.*;
public class Q10 {
    public static int countPrimes(int n)
    {
        if(n <= 2)
            return 0;
        boolean isPrime[] = new boolean[n];
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2 ; i < n ; i++ )
        {
            isPrime[i] = true;
        }
        for(long p = 2; p * p < n; p++)
        {
            if(isPrime[(int) p])
            {
                for(long j = p*p ; j < n ; j += p)
                {
                    isPrime[(int) j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2 ; i < n ; i++)
        {
            if(isPrime[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = countPrimes(n);
        System.out.println(result);
    }
}