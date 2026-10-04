import java.util.*;
public class Q6 {
    public static int difference(int n,int a,int b)
    {
       int c1 = 0;
       int c2 = 0;
       int d;
    
       do{
          d = n%10;
          if (d == a)
            c1++;
          if (d == b)
            c2++;
          n /= 10;
        }while(n != 0);
    return Math.abs(c1 - c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter a number:");
        int b = sc.nextInt();
        int result = difference(n,a,b);
        System.out.println(result);
        sc.close();
}
}

