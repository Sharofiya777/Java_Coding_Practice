import java.util.*;
class IndexOfTarget{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==target){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}