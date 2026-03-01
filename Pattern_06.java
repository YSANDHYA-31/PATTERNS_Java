/* Hollow Rectangle Star Pattern
   
    Input: 4 (Rows)
           10 (Columns)
    
    Output: 
    
        **********
        *        *
        *        *
        **********

*/


import java.util.*;
public class Pattern_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        for(int i=1; i<=Row; i++){
            for(int j=1; j<=Col; j++){
                if(i==1 || i==Row || j==1 || j==Col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
