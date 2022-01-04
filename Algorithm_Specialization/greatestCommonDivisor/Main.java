/*
Program to calculate the GCD/HCF of two numbers

Approach 1:
Loop from 1 to the smallest number and check for each number
Time complexity : O(n) where n is the smallest number


Approach 2:
Make use of Euclid's Lemma
Euclid's Lemma = gcd(a,b) = gcd(b,aPrime) = gcd(bPrime,a)
where aPrime = a%b given a>b

Time Complexity: log(a*b)


Therefore approach 2 is much much faster for than approach 1
*/

class Main {

    //Approach 1
    static int gcd1(int a,int b){
        int gcd = 1;

        //Making sure that a is larger than b, if not then do it explicitly
        if(a<b){
            int temp = a;
            a=b;
            b=temp;
        }

        for(int i=1;i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }

        return gcd;
    }


    //Approach 2
    static int gcd2(int a,int b){
        if(b==0){return a;}
            //Calculating aPrime
            int aPrime = a%b;
            return gcd2(b,aPrime);

    }
    public static void main(String []args) {
        //Stress testing our algorithm for all pair of numbers from 1-1000 
    }
}