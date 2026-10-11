import java.util.*;
public class Q7 {
    public static int gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int GCDofArray(int[] arr)
    {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = GCDofArray(arr);
        System.out.println(result);
        sc.close();
    }
}