import java.rmi.server.SocketSecurityException;

public class AssignementPro {
 public static void printDigitSpell(int n,String digit[]){
     if(n == 0){ // base case
      return;
     }
     // kaam
     int lastdigit = n %10;
     printDigitSpell(n/10,digit);
     System.out.print(digit[lastdigit]+" ");
 }

 public static int strLentght(String str){
    if(str.length() == 0){// base case
         return 0;
    }
    return strLentght(str.substring(1)) + 1;

 }
 public static void main(String[] args) {
// Question-3 find out the length of string
 String str = "Computer" ;
 System.out.println("The length of string " + str + " = "+strLentght(str));
  

 // question-2 print the 2019 -- two zero one nine
//  int N = 1947;
//  String digit[] = {"Zero","One" , "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//  System.out.println(N+" in word form is given below :-");
// printDigitSpell(N, digit);

    // Question-1 find out all indices of key element in the given array
//    int arr[] = {3,2,5,4,6,2,7,2,2};
//     int key = 2;
//    System.out.println(key + " are avaialable at indices ");
//      printKeyIndices(arr, 0,key);
 }

 public static void printKeyIndices(int arr[],int idx,int key){
    if(idx == arr.length-1){
        System.out.print(idx + " ");
        return;
    }
    // kaam
    if(arr[idx] == key){
        System.out.print(idx + " ");
    }
    printKeyIndices(arr, idx+1, key);
 }
}
