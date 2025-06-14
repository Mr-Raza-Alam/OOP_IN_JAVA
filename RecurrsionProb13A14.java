public class RecurrsionProb13A14 {
  public static void printBinaryString(int n,int lastPlace,String str){
    if(n == 0){//base case
   System.out.println(str);
      return;
    }
    // kaam
    printBinaryString(n-1,0, str +="0");
    if(lastPlace == 0){
      printBinaryString(n-1,1, str +="1");
    } 
  }
 public static void main(String args[]){
   System.out.println("Total possible binary strings formed of size " + 3+" are given below :-");
   printBinaryString(3,0,"");
   //System.out.println("Total no.of ways to stand be a single or being paired-up among "+3+" friends = "+ getNofWays(3));
 }
 
 public static int getNofWays(int n){
   if(n == 1 || n ==2){// base case
      return n;
    }
 // kaam 
 int single = getNofWays(n-1);
 int pairup = getNofWays(n-2);
 int totalways = single + (n-1)*pairup;
 return totalways;
  }
}
