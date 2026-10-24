import java.util.*;
public class Q12 {
   
    public static int findPower(int base,int power,int MOD)
    {
        int result = 1%MOD ;
        for(int i = 0; i < power; i++)
        {
           result = ( result * base)%MOD ;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        System.out.println("Enter the power:");
        int power = sc.nextInt();
        System.out.println("Enter the value of MOD :");
        int MOD = sc.nextInt();
        System.out.println(findPower(base,power,MOD));
    } 
}
