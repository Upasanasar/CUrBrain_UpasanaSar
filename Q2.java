import java.util.*;
public class Q2{
    public static int reverse_and_double(int n)
    {
       int temp = n;
      int result = 0;
     while(temp != 0){
          result = result*10 + Math.abs(temp%10)*2;
          temp /= 10;
      }
      if(n<0)
            return result*-1;
        else
            return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = reverse_and_double(n);
        System.out.println(result);
        sc.close();

}
}