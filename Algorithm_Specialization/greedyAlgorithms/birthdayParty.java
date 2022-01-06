import java.util.ArrayList;

public class birthdayParty {

    //Approach1
    static void groups1(){
        //Storing all the possible groups of n children in an arrayList
        //Then for each group individually check whether the difference between max(group) - min(group) > 1, then that
        //group is not feaseable and hence that group has to be removed from the arrayList
        //This solution is quite slow even for a small number, hence no preferred
        System.out.println("Solution coming soon once finding combinations is learnt");
    }

    //Approach2
    static ArrayList<ArrayList<Double>> groups2(double children[]){
       
       /*
        //if the group is empty, return -1
        if(children.length==0) return -1;
        //if only 1 child is present return 1
        if(children.length==1) return 1;
        */

        ArrayList<ArrayList<Double>> ans = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> temp = new ArrayList<Double>();

        temp.add(children[0]);

        int ptr=0;
        for(int i=1;i<children.length;i++){
            if(children[i]-children[ptr]<=1){
                temp.add(children[i]);
            }
            if(children[i]-children[ptr]>1){
                ptr = i;
                //Creating a new ArrayList copying the elements of temp
                ArrayList<Double> t = new ArrayList<Double>();
                for(int a=0;a<temp.size();a++) t.add(temp.get(a));
                //Now add that newly created ArrayList to the ans ArrayList
                ans.add(t);
                temp.clear();
                temp.add(children[i]);
            }
        }

        //edgeCase : if the last and second elements differ by more than 1, then add the last element to the group
        //If the above edge case happens, then the last element will already have been added in our temp ArrayList
        ans.add(temp);

       return ans;

    }
    public static void main(String args[]){
        double children[]={3,4,5.5,7,9,10,11,12,13,17,22};
        System.out.println(groups2(children));
    }
}
