import java.util.*;
public class SameNumberWithSameFrequency {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[n];
    int b[]=new int[m];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
        b[i]=sc.nextInt();
    }
    Map<Integer,Integer> map1=new HashMap<>();
    for(int num1 : a){
        map1.put(num1 , map1.getOrDefault(num1,0)+1);
    }
    Map<Integer,Integer> map2=new HashMap<>();
    for(int num2 : b){
        map2.put(num2 , map2.getOrDefault(num2,0)+1);
    }
    for(int key : map1.keySet()){
        if(map2.containsKey(key) && map1.get(key).equals(map2.get(key))){
            System.out.print(key + " ");
        }
        }
        sc.close();
    }
    }