import java.util.*;
public class SpanOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int ans=span(arr);
        System.out.println(ans);
     }
     
     public static int span(int[] arr){
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         
         for(int i=0;i<arr.length;i++){
             if(arr[i]>max){                        
                 max=arr[i];                            //max element of array
             }
             if(arr[i]<min){
                 min=arr[i];                           //min element of array
             }
         }
         
         int span=max-min;
         return span;
     }
}
