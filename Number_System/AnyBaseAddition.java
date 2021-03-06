import java.util.*;
public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getSum(b, n1, n2);
        System.out.println(d);
     }
    
     public static int getSum(int b, int n1, int n2){
         int c=0;
         int ans=0;
         int pow=1;
         
         while(n1!=0 || n2!=0 || c!=0){
             int d1=n1%10;                      //extracting the last digit of n1
             int d2=n2%10;                      //extracting the last digit of n2
             n1=n1/10;                         
             n2=n2/10;                          
             
             int s=d1+d2+c;
             int sum=s%b;                       
             c=s/b;
             
             ans=ans+sum*pow;
             pow=pow*10;
         }
         return ans;
     }
}
