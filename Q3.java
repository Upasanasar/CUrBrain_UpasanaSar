import java.util.*;
public class Q3 {
    public static int palindrome_or_Sum(int n)
    {
       int temp = n;
       int result = 0;
       while(temp != 0){
          result = result*10 + temp%10;
          temp /= 10;
        }
    if(n == result)
         return n;
    else
        return n+result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = palindrome_or_Sum(n);
        System.out.println(result);
        sc.close();
}
}
