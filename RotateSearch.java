public class RotateSearch {
   public static int getTarIndex(int arr[],int tar,int si,int ei){
    if(si>ei){ // base case when target is absent in the array
        return -1;
    }
    // kaam
    int mid = si + (ei-si)/2;
    if(arr[mid] == tar){ // target is found
        return mid;
    }
    // case -1 mid on L-1
    if(si <=mid){
       if(arr[si]<= tar && tar<=arr[mid]){ // case a
            return  getTarIndex(arr, tar, si, mid-1);
        } else{// tar is right of mid from L-1 case b
           return  getTarIndex(arr, tar, mid+1, ei);
         }
  } 
   // case-2 mid on L-2
   else{
        if(arr[mid]<= tar && tar<= arr[ei]){
          // case c
         return   getTarIndex(arr, tar, mid+1, ei);
        } else{ // case d
      return getTarIndex(arr, tar, si, mid-2);
      }
    }
}
 public static void main(String[] args) {
    int arr[]= {4,5,6,7,0,1,2};
    int n = arr.length;
    int tarIndex = getTarIndex(arr,6,0,n-1);
    System.out.println("Target element is present at index = "+ tarIndex);
 }
    
}
