import java.util.*;
class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        boolean found=false;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(a[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(i);
            }
            found=false;
        }
        sc.close();
    }
}
