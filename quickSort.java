public class quickSort {
 public static void main(String args[]){
  int arr[] = {4,6,3,7,2,1,8};
  int n = arr.length;
  QuickSort(arr,0,n-1);
  //print after quick sort
  System.out.println("After quick sort , the new updated array is");
  for(int i = 0; i<n; i++){
    System.out.print(arr[i] + " ");
  }
 }
 
 public static void QuickSort(int arr[],int low,int high){
     if(low < high){// base case is (if (low>= high) return;)that is similar to low<high;
        int pvidx = partition(arr,low,high);
        QuickSort(arr, low, pvidx-1);// sort the elemnet before pivot's element 
        QuickSort(arr, pvidx+1, high);// sort the elements after pivot's element
     }
 }

 public static int partition(int arr[],int low,int high){
     int pivot = arr[high];
     int i = low-1;//which will accomadate the place for the element ,lesser than pivot
     //swap
     for(int j = low; j<high; j++){
        if(arr[j]<pivot){
         i++;
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
        }
     }
     // but still pivot is at last index so again we apply swapping
     i++;
     int temp = arr[i];
     arr[i] = pivot;
     arr[high] = temp;
    
    return i;
 }
}
