import java.util.*;
public class SumofOddFreq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i] , map.getOrDefault(a[i],0)+1);
int sum = 0;

        // Print frequency and calculate sum
        for (int key : map.keySet()) {

            System.out.println(key + " -> " + map.get(key));

            if (map.get(key) % 2 != 0) {
                sum += key;
            }
        }

        System.out.println("Sum = " + sum);
    }
    sc.close();
}
}
