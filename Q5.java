import java.util.*;

public class Q5 {
    public static void replace_even(int n){
        int c  = (int)Math.log10(n) + 1;
        int[] arr = new int[c];
        for (int i = c-1 ; i>= 0; i--){
            if((n%10)%2==0)
                arr[i] = 0;
            else
                arr[i] = n%10;
            n /= 10;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        replace_even(n);
        sc.close();
}
}

