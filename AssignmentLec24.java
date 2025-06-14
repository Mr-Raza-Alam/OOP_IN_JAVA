public class AssignmentLec24 {
public static void Merge(String arr[],int si,int mid,int ei){
    String temp[] = new String[ei-si+1];
    int idx1 = si;
    int idx2 = mid+1;
    int k = 0;
    // sort
    while(idx1<=mid && idx2<=ei){
        if(arr[idx1].compareTo(arr[idx2])<=0){// that means arr[idx1]<arr[idx2];
          temp[k] = arr[idx1];
          k++; idx1 +=1;
        } else{
          temp[k] = arr[idx2];
          k++; idx2 +=1;
        }
    }
    while(idx1<=mid){
         temp[k] = arr[idx1];
         k+=1; idx1++;
    }
    while (idx2<=ei) {
      temp[k] = arr[idx2];
      k+=1; idx2+=1;
    }
    // copy into originat string array
   for(int i = 0,j=si; i<temp.length; i++,j++){
      arr[j] = temp[i];
   }
}

 public static void MergeSort(String arr[],int si,int ei){
     if(si<ei){ // base case is if(si>=ei) return 
        int mid = si + (ei-si)/2;
        // left part
        MergeSort(arr, si,mid);
        // right part
        MergeSort(arr, mid+1, ei);
        // sort
        Merge(arr,si,mid,ei);
     }
 }
  public static void main(String args[]){
    String arr[] = {"raza","priyam","rupak","gautam"};
    int n = arr.length;
    MergeSort(arr,0,n-1);
    System.out.println("After Merge-Sort ,The sorted strings are given below :-");
    for(int i = 0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
    
}