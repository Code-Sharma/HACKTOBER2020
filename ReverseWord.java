import java.util.Scanner;

public class ReverseWord {

    private static int countWords(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' )
                {
                    count++;
                }
        }
        return count+1;
    }
    private static void wordReverse(String s, int n) {

        String words[] = s.split(" ");
        String nWord = words[n-1];

        StringBuilder string = new StringBuilder();

        string.append(nWord);
        string = string.reverse();

        

        words[n-1] = string.toString();
        for (String s1 : words) {
            System.out.print(s1 + " ");
        }
       

        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();

        int wordCount = countWords(st);
        System.out.println("Enter the no of word to be reversed :");
        int n = sc.nextInt();

        if(n<=wordCount){
            wordReverse(st,n);

        }
        

    }
}
