import java.util.*;
public class Q16 {
    public static int second(int arr[],int n)
    {
        int max = -1;
        int sec = -1;
        int flag = 0;
        for(int i =0 ; i < n; i++ )
        {
            if( max < arr[i]){
                sec = max;
                max = arr[i];
    
            }
            else if( arr[i] > sec && arr[i] < max){
                sec = arr[i];

            }
        }
        return sec;
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
        System.out.println(second(arr,n));
    }
}

