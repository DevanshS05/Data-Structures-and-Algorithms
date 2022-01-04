 /*
 
 Question : 
 Given an array of N elements,
 Find out the maximum possible product from the constituent elements of  the array
 Ex : Given an array [1,2,3,4,5]
 Output : 20
 */
 
 /*
 Solution 1
 Time Complexity : O(n^2)
 Space Complexity : 
 */
 
 public static void main(String []args){
        long arr[] = {7,5,10004,2,8,8,1000000,1,2,3};
        
        long maxProduct = arr[0]*arr[1]; //Initializtion with the first possible product
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                long prod = arr[i]*arr[j];
                maxProduct = Math.max(maxProduct,prod);
                //System.out.print("Product is: "+prod+"\n");
            }
        }
        
        System.out.println("The maximum possible pair product is: "+maxProduct);
    }
    

/*
Solution 2
Time Complexity : O(n)
Space Complexity :
*/

public static void main(String []args){
        
        //Stress testing our algorithm
        
        
        
        //Stress Testing code ends here
        
        long arr[] = {7,5,10004,2,8,8,1000000,1,2,3};
        
        //Finding out the first max number
        int maxOne = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[maxOne]){
                maxOne = i;
            }
        }
        
        //Finding the second maximum number
        int maxSecond = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxSecond] && i!=maxOne) {
                maxSecond = i;
            }
        }
        
        long product = arr[maxOne]*arr[maxSecond];
        
        System.out.println("The max. possible product is: "+product);
    }
