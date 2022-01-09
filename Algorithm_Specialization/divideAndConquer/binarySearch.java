class binarySearch {

    static int[] binSearch(int arr[],int low,int high,int key){
        if(high<=low){
            int a[] = {-1};
            return a;
        }

        int mid = (low+high)/2;

        if(arr[mid]==key){
            int a[]= {1};
            return a;
        }
        else if(arr[mid]>key){
            return binSearch(arr, low, mid-1, key);
        }
        else if(arr[mid]<key){
            return binSearch(arr, mid+1, high, key);
        }
        int var[] = {};
        return var;
    }
    public static void main(String[] args) {
        int arr[] = {-11,-5,0,1,2,3,4,5,6,7,8,9,10};
        int low = 0;
        int high = arr.length-1;
        int key = 50;

        int res[] = binSearch(arr, low, high, key);
        for(int i=0;i<res.length;i++) System.out.println(res[i]);
    }    
}
