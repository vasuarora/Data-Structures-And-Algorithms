import java.util.*;
public class SearchInSorted2DMatrix {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scn.nextInt();
            }
        }
        
        int x=scn.nextInt();
        int i=0;
        int j=a[0].length-1;                                //top right corner of matrix
        
        while(i<a.length && j>=0){
            if(a[i][j]==x){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            
            else if(x<a[i][j]){                       //move towards left in the matrix if x is smaller than matrix element
                j--;
            }
            
            else if(x>a[i][j]){                       //move downwards in the matrix if x is larger than matrix element
                i++;
            }
        }
        
        System.out.println("Not Found");
    }
}
