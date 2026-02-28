/*   Solid Rectangle

    Input:  Row = 3                   Input:  Row = 5
            Col = 5                           Col = 3
    
    Output:  (3x5)                    Output:  (5x3)
    
        * * * * *                             * * *  
        * * * * *                             * * *
        * * * * *                             * * *
                                              * * *
                                              * * *

*/

import java.util.*;
public class Pattern_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        for(int i=0; i<Row; i++){
            for(int j=0; j<Col; j++){
                System.out.print("*");
                
                // if j == 9 it doesn't print space after the star
                if(j!=Col-1){
                    System.out.print(" ");
                }           
            }
            System.out.println();
        }
    }
    
}
