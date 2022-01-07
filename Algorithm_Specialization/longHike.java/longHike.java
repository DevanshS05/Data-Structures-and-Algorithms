public class longHike {

    static void sack1(double wt[],double val[],int capacity,String itemName[]){
        //First sorting for the items that have the highest food value to weight ratio
        //Because more nutritious is the food, the more ideal it is to fill first
        double vw[] = new double[wt.length];
        for(int i=0;i<wt.length;i++){
            double tmp = val[i]/wt[i];
            vw[i] = tmp;
        }
        
        for(int i=0;i<vw.length;i++){
            //check if the sack is full, then exit
            if(capacity==0) return;
            int maxIDX=0;
            for(int j=0;j<vw.length;j++){
                if(vw[j]>vw[maxIDX] && wt[j]>0) maxIDX=j;
            }
            int a = Math.min((int)wt[maxIDX],capacity);
            capacity=capacity-a;
            wt[maxIDX] = wt[maxIDX]-a;
            System.out.print("Item added: \n");
            System.out.print("Name :"+itemName[maxIDX]+" Weight: "+a+'\n');
        }
        
    }

    static void sack2(double wt[],double val[],int capacity,String itemName[]){
        //First sorting for the items that have the highest food value to weight ratio
        //Because more nutritious is the food, the more ideal it is to fill first
        double vw[] = new double[wt.length];
        for(int i=0;i<wt.length;i++){
            double tmp = val[i]/wt[i];
            vw[i] = tmp;
        }
        /*For that we have to learn a sorthing algorithm which works in O(nlogn) time
        Because if we use our traditional sorting algorithms which work in O(n^2) time,
        then it will result in same time complexity as the previous solution
        Hence defeating our purpose in the first place
        */

        System.out.println("Solution coming soon!");
    }
        
    public static void main(String[] args) {
        String itemName[] = {"Apples","Beer","Chocolates"};
        double wt[] = {10,200,5};
        double val[] = {20,2,100};
        int capacity = 10;
        sack1(wt,val,capacity,itemName);
    }
}
