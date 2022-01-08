class linearSearch{


    //Implementing linear search using recursion
    //Much room for improvement in the code
    static int[] linSearch(int arr[],int low,int high,int key){
        if(high<=low){
            int a[] = {-1};
            return a;
        }
        else if(arr[low]==key){
            int a[] = {1};
            return a;
        }
        return linSearch(arr, low+1, high, key);
    }

    public static void main(String args[]){
        int arr[] = {6,98,90,-23,90,1,23};
        int key = 988;
        int low = 0;
        int high = arr.length-1;

        int res[] = linSearch(arr, low, high, key);
        for(int i=0;i<res.length;i++) System.out.println(res[i]);
    }
}