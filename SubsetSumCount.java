import java.util.*;
class SubsetSumCount{
    static int count=0;
   public static void subsetCount(int[] a, int index, int sum, int target) {

    if (index == a.length) {
        if (sum == target) {
            count++;
        }
        return;
    }

    // Include current element
    subsetCount(a, index + 1, sum + a[index], target);

    // Exclude current element
    subsetCount(a, index + 1, sum, target);
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        subsetCount(a,0,0,target);

        if(count==0){
            System.out.println("No target sum");
        }
        else{
            System.out.println(count);
        }
        sc.close();
    }
}