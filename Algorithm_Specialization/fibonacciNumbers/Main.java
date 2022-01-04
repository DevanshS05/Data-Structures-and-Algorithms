/*
Approach 1: Using recursion 
Cons: As the size of the number grows, the time required to calculate grows very fast and becomes a very very large number


Approach 2: Using iteration
Idea : f(n) = f(n-1) + f(n-2)
The most ideal algorithm studied uptil now to find out large fibonacci numbers.
*/



class Main{

    //Approach 1
    static int fibonacci1(int n){
        //defining the base cases
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibonacci1(n-1)+fibonacci1(n-2);
        }
    }

    //Approach 2
    static int fibonacci2(int n){
        //edge case if n=1 or 2 then return 0 or 1 accordingly
        if(n==1 || n==2){
            return n-1;
        }

        //Defining an array having n elements
        int arr[] = new int[n];
        arr[0]=0;
        arr[1] = 1;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        //Returning the calculated fibonacci number
        return arr[n-1];
    }




    public static void main(String args[]){
        //Stress testing our algorithm
        //To do so, we will be calling fibonacci numbers upto 50 using both the methods and comparing our results
        //Notice how around n=43 or 44 the execution of the program becomes really slow

        for(int x=1;x<=50;x++){
            if(fibonacci1(x)==fibonacci2(x)){
                System.out.println("Test passed: OK at n = "+x);
            }
            else{
                System.out.println("Test Failed! at n = "+x);
                break;
            }
        }
    }
}