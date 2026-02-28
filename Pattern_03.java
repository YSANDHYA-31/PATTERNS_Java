import java.util.*;
public class Pattern_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=5; i>=N; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            for(int k=1; k<=M; k++){
                for(int l=1; l<=k; l++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
   }
    
