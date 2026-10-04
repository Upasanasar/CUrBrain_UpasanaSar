import java.util.*;
public class Q4 {
    public static int difference(int n)
    {
       int sum = 0;
       int product = 1;
       while(n != 0){
          sum += n%10;
          product *= n%10;
          n /= 10;
        }
    return (-sum + product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = difference(n);
        System.out.println(result);
        sc.close();
}
}
