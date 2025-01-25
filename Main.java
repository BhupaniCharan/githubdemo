import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr={
            {3, 4, 5},
            {4, 2, 1},
            {2, 7, 8},
            {2, 5, 4},
        };
        System.out.println(arr.length);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println(); 
        
        }
    
    }
}