import java.util.*;
class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> set=new HashSet<>();

        int left=0;
        int maxlength=0;
        
        for(int right=0;right<str.length();right++){
            if(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxlength=Math.max(maxlength, right - left+1);
        }
        System.out.println(maxlength);
        sc.close();

    }
}
