import java.util.Scanner;
public class powerRecursion {
 public static double myPower(double x,int n){
    if(n==1){
       return x;
    }
    else if(n== -1){
        return (1/x);
    }
    else if(n == Integer.MIN_VALUE){
        return 0;
    }
    // kaam
    double res;
    if((n&1)==0){
      double left1 =  myPower(x, n/2);
      double right1 =  myPower(x, n/2);
       res = left1*right1;
    } else{
        double left1 =  myPower(x, n/2);
        double right1 =  myPower(x, n/2);
         res = x*left1*right1;
    }
    return res;
 }
 public static void main(String args[]){
    double x;
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a base : ");
     x = sc.nextDouble();
     System.out.print("Enter the power base to x : ");
     n = sc.nextInt();
    System.out.println(x+"^"+n+" = "+myPower(x, n));
 }
    
}
