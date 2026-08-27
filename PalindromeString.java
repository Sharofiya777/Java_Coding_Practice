import java.util.*;
public class PalindromeString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       boolean isPalindrome = true;
       int left=0;
       int right = str.length()-1;
       while(left<right){
        if(str.charAt(left) != str.charAt(right)){
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }
    if(isPalindrome){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
    sc.close();
    }
}