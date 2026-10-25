import java.util.*;
public class Q14 {

    static int[] thresholdcount(int[] sales, int threshold) {
    
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= threshold) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= threshold) {
                result[index] = sales[i];
                index++;
            }
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
        System.out.println("Enter the threshold:");
        int t = sc.nextInt();
        System.out.println(Arrays.toString(thresholdcount(arr,t)));
    }
}