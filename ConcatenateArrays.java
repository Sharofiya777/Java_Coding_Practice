import java.util.*;
public class ConcatenateArrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        for(int j=0;j<m;j++){
            System.out.print(b[j]+" ");
        }
        sc.close();

    }
}