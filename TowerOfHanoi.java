public class TowerOfHanoi {
 public static int countSubstring(String str,int si,int ei){
    if(si>ei){// base case
       return 0;
    }
    // kaam
    // remove 1st character + remove last charcter - remove(1st and last);
    int ans = countSubstring(str, si+1, ei) + countSubstring(str, si, ei-1) - countSubstring(str, si+1, ei-1);
     if(str.charAt(si) == str.charAt(ei)){
        ans++;
     }
    return ans;
 }
 public static void main(String args[]){
   // String str = "abcab"  ;
   // int n = str.length();
   // System.out.println("Total no.of substring with 1st & last character are same = "+countSubstring(str, 0, n-1));

   System.out.println("The steps to shift " + 4 + " dics from T-A to T-C,using T-B");
   toh(4,'A','C','B');
 }
 public static void toh(int n,char a,char c,char b){// move n dics from A to C,usin B
   if(n==0){// base case
     return;
   }
    // kaam 
    toh(n-1,a,b,c);// it is faith that n-1 dics has been place on tower-B ,using c with given rules
    System.out.println("Move "+n+ "th dics from "+ a +" TO "+c);// last i.e. nth dics is place on tower c
    toh(n-1,b,c,a);// again it is faith that n-1 dics has been placed on tower-C,using a with given rules
 }
}
