import java.util.*;
public class Q8 {
    public static int kthFactor(int n, int k)
    {
        int count = 0;
        for(int i = 1; (long) i * i <= n; i++)
        {
            if(n % i == 0)
            {
                count++;
                if(i != n / i)
                    count++;
            }
        }
        int factors[] = new int[count];
        int idx = 0;
        for(int i = 1; (long) i * i <= n; i++)
        {
            if(0 == n % i)
            {
                factors[idx++] = i;
                if(i != n / i)
                    factors[idx++] = n / i;
            }
        }
        Arrays.sort(factors);
        if(k > count)
            return -1;
        else
            return factors[k - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter k:");
        int k = sc.nextInt();
        int result = kthFactor(n, k);
        System.out.println(result);
        sc.close();
    }
}