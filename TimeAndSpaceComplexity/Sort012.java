import java.util.*;
public class Sort012 {
    public static void sort012(int[] arr){
        int i=0;
        int j=0;
        int k=arr.length-1;

        //0 to i-1 => 0's
        //i to j-1 => 1's
        //j to k =>unknowns
        //k+1 to end => 2's
        
        while(j<=k){
            if(arr[j]==1){
                j++;                              //increasing 1's region
            }
            else if(arr[j]==0){
                swap(arr,j,i);
                i++;
                j++;                               //swapping 0 and 1 and increasing 0's and 1's region respectively
            }
            else{
                swap(arr,j,k);                     //swapping 2 and the unknown element
                k--;                               //increasing 2's region
            }
        }
        
      }
    
      // used for swapping ith and jth elements of array
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    
      public static void print(int[] arr){                              //printing the sorted array
        for(int i = 0 ; i < arr.length; i++){
          System.out.println(arr[i]);
        }
      }
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
          arr[i] = scn.nextInt();
        }
        sort012(arr);
        print(arr);
      }
}
