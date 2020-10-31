import java.util.Scanner;

public class Weights {
    public static void minSumofWeights(int[] stones,int n){
        int sum = stones[0]; 
      
        for (int i = 1; i < n; i++)  
        { 
            if (stones[i] == stones[i - 1]) {          
      
                 
                int j = i; 
                while (j < n && stones[j] <= stones[j - 1])  
                {          
                    stones[j] = stones[j] + 1; 
                    j++; 
                } 
            } 
            sum = sum + stones[i]; 
        } 
      
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] stones = new int[n];

        for(int i=0;i<n;i++){
            stones[i] = sc.nextInt();

        }

        minSumofWeights(stones,n);

    }
    
}
