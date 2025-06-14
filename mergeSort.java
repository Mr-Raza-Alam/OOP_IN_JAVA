public class mergeSort {
  public static void conqure(int arr[],int si,int mid,int ei){
    int n = ei -si +1;
    int merge[] = new int[n];
    int idx1 = si;// indicate left merged array
    int idx2 = mid+1; // indicate right merged array;
    int x = 0; // indicate merged array
   // sort
      while(idx1<=mid && idx2 <= ei){// for bigger merged array 
         if(arr[idx1]<arr[idx2]){
            merge[x] = arr[idx1];
            x +=1;
            idx1 +=1;
         }else{
            merge[x] = arr[idx2];
            x +=1; 
            idx2 +=1;
         }
      }
    while(idx1<=mid){// for remaining sorted elements in left merged array
        merge[x] = arr[idx1];
        x +=1;
        idx1 +=1;
    }
    while(idx2<=ei){// for remaining sorted element in right merged array
        merge[x] = arr[idx2];
        x +=1;
        idx2 +=1;
    }
    // copy merged- sorted array into original array;
   for(int i = 0,j= si; i<n; i++,j++){
        arr[j] = merge[i];
   }
  }
    public static void divide(int arr[],int si,int ei){
        if(si<ei){// base case is if(si>=) return and it is similar one (si<ei)
            int mid = si + (ei -si)/2;
            divide(arr,si,mid); // Left division;
            divide(arr,mid+1, ei);// Right division;
            conqure(arr,si,mid,ei);
        }
    }
 public static void main(String args[]){
    int arr[] = {6,3,9,5,2,-1,8,1,4};
    int size = arr.length;
    divide(arr, 0, size-1);
    // print the sorted array's elements after merged sort
    System.out.println("After Merged-Sort,The updated array is given below");
    for(int i =0; i<size; i++){
        System.out.print(arr[i] + " ");
    }
 }
    
}
