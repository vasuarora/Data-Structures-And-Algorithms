import java.util.*;
import java.io.*;
public class InverseOfArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
    
      public static int[] inverse(int[] a){
          int[] inv=new int[a.length];                        
          for(int i=0;i<a.length;i++){
              int t=a[i];                                //put the array value in element t
              inv[t]=i;                                  //using the element of array a as index of inv array            
          }                                             //and index of array a as element of array inv
          return inv;
        
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        int[] inv = inverse(a);
        display(inv);
     }
}
