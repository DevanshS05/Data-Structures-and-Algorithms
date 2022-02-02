public class binarySearch {
  static int BS(int arr[], int target){
    if(arr.length==0){return -1;}

    if(arr.length==1){if(arr[0]==target){
        return 0;
    }else{
        return -1;
    }
}

    int start = 0;
    int end = arr.length-1;

    boolean isAsc = arr[end]>arr[start]?true:false;

    while(start<=end){
        int mid = start + (end-start)/2;

        if(target<arr[mid]){
            if(isAsc){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        if(target>arr[mid]){
            if(isAsc){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        if(target==arr[mid]){
            return mid;
        }
    }

      return -1;
  }  
}
