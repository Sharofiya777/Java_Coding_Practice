import java.util.*;
public class StrongNumber {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original = num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=factorial(digit);
            num/=10;
        }
        if(sum==original){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
        sc.close();
    }
}
