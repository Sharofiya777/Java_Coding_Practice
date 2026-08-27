import java.util.*;
public class PrimeBetweenRanges {
    public static boolean findPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt(); //20
        int m=sc.nextInt(); //50
        for(int i=n;i<=m;i++){
            if(findPrime(i)){
                System.out.print(i+" ");
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
