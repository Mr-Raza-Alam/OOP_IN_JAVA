public class Reccursion {
 public static void printDecreasingOrder(int n){
    if(n==1){//this is base case
    System.out.println(n);
    return;
    }
    System.out.print(n + " ");//this is kaam
    printDecreasingOrder(n-1);//this is recursive call
 }
 public static boolean isSorted(int num[],int i){
    if(i==num.length-1){//base case;
         return true;
    }
    if(num[i]>num[i+1]){//if array is unSorted or not 
        return false;
    }

    return isSorted(num, i+1);
 }

 public static int firstOcc(int num[],int i,int key){
    if(i == num.length-1){//base condition
        return -1;
    }
      if(num[i] == key){//key found at first time
        return i;
      }
      return firstOcc(num, i+1, key);
 }
 public static int lastOcc(int num[],int i,int key){//by my logic
    if(i == 0){//base condition
        return -1;
    }
      if(num[i] == key){//key found at first time
        return i;
      }
      return firstOcc(num, i-1, key);
 }
 public static int  pow(int x,int n){//problem-9
     if(n == 1){
        return x;
     }
     return x*pow(x,n-1);
 }
    public static void main(String args[]){
       System.out.println("The value of 3^5 = "+pow(3,5));        
        // int num[] = {2,3,5,6,8,9,4,3,7};
        // int idx = num.length-1;
    //    System.out.println(lastOcc(num,idx,1));
    //System.out.println(firstOcc(num,0,7));
    //System.out.println(isSorted(num,0));
    //   int n = 12;
    //   printDecreasingOrder(n);
    //   printIncreasingOrder(n);
    //  System.out.println("\nThe sum of first natural no. = "+sumOfNaturalNo(6));

    }
    public static int sumOfNaturalNo(int n){
        if(n==1){//this is base case
        return 1;
        }
      int sum ,sN = sumOfNaturalNo(n-1);      
      sum = n + sN ;
      return sum;
    }

    public static void printIncreasingOrder(int n){
        if(n==1){//this is base case
        System.out.print(n + " ");
        return;
        }
        printIncreasingOrder(n-1);//this is recursive call
        System.out.print(n + " ");//this is kaam
     }
    
}
