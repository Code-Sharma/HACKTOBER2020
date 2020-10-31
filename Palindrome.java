import java.util.*;
public class Palindrome {
    public static boolean Palindrome(String s) {
        
        int i =0,j =s.length()-1;
        while (i < j) { 
  
            // If there is a mismatch 
            if (s.charAt(i) != s.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or word");
        String input = sc.next();


        if(Palindrome(input.toUpperCase())){
            System.out.println(input+" is a palindrome");
        }
        else
            System.out.println(input+" is not a palindrome");
        
        
    }   
}
