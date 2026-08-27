import java.util.*;
public class SecondLargestDistinctElement {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=n-1;i>=0;i--){
        if(a[i]!=a[i-1]){
            System.out.println(a[i-1]);
            break;
        }
        else{
            System.out.println("No second largest element");
        }
    }
    sc.close();
}

}

