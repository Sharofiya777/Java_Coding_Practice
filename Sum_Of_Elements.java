//Find the sum of all elements
import java.util.Scanner;
public class Sum_Of_Elements {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int [] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int sum=0;
	    for(int i=0;i<n;i++){
	        sum+=a[i];
	        
	    }
	    System.out.println("sum = "+ sum);
        sc.close();
    }
    
}
