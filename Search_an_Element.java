import java.util.Scanner;
public class Search_an_Element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean found=false;
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==t){
               found=true;
            }
        }
        if(found){
            System.out.println("Element found");
        }
        else{
        System.out.println("Element not found");
    }
            sc.close();

    }
}
