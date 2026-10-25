import java.util.*;
public class Q15 {
    static int minAbsoluteValue(int[] arr) {
        int best = arr[0];
        int bestAbs = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int currentAbs = Math.abs(arr[i]);
            if (currentAbs < bestAbs) {
                best = arr[i];
                bestAbs = currentAbs;
            }
        }
        return best;
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
        System.out.println(minAbsoluteValue(arr));
    }
}