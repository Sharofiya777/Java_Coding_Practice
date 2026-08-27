import java.util.*;
class FindPrime{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //10
        for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
sc.close();
    }
}