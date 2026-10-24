import java.util.*;
public class Q13 {
    public static boolean prefix(int[] arr,int n,int k)
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if( sum%k == 0)
                return true;
        }
        return false;
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
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        System.out.println(prefix(arr, n,k));
    } 
}
