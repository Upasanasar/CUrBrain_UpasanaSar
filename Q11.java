import java.util.*;
public class Q11 {
    public static final int MOD = (int) Math.pow(10.0,9.0) + 7;

    public static int findSum(int[] arr,int n)
    {
        int result = 0;
        for(int i = 0; i < n; i++)
        {
           result = ( result + arr[i])%MOD ;
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
        System.out.println(findSum(arr, n));
    } 
}
