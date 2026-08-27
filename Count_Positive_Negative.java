import java.util.Scanner;
public class Count_Positive_Negative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int Pos=0;
        int Neg=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                Neg++;
            }
            else if(a[i]>0){
                Pos++;
            }
        }
        System.out.println("Positive Numbers:"+Pos);
        System.out.println("Negative Numbers:"+Neg);
        sc.close();
    }
    
}
