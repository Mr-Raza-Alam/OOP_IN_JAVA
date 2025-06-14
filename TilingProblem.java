public class TilingProblem {
 public static void removeDuplicateCharc(String str,StringBuilder newstr,int idx,boolean map[]){ 
    if(idx == str.length()){//base case
        System.out.println(newstr);
        return;
    }
    // kaam karo
    char currChar = str.charAt(idx);//find out the charcter from each idx
    if(map[currChar-'a'] == true){
        //Duplicates elements is present so call again 
      removeDuplicateCharc(str, newstr, idx+1, map);
    }  else{
        map[currChar - 'a'] = true;
        removeDuplicateCharc(str, newstr.append(currChar), idx++, map);
    }
 }
 public static void main(String args[]){
    String str = "appnnacollege";
    //print 
    System.out.println("After removing the duplicates elements,the new string :-");
    removeDuplicateCharc(str,new StringBuilder(""), 0, new boolean[26]);

 // System.out.println("Total no. of ways to fill the board of size 2*"+4+" with tiles of size (2*1) = "+noOfWays(4));
 }
 public static int noOfWays(int n){
    // base case
    if(n == 0 || n == 1){
        return 1;
    }
    //make choice
    // select vertically spread the tiles of size (2*1) i.e. f(n-1)
    int vertically = noOfWays(n-1);
    // select horizontally spread the tiles of size (2*1) i.e.f(n-2)
    int horizontally = noOfWays(n-2);
    // total ways 
    int totalWays = vertically + horizontally;    
    return totalWays;
 }
    
}
