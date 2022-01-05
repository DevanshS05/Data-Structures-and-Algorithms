/*
Problem : We have a vehicle and we have to travel from point A to B with the minimum number of gas refills
Given that our vehicle can travel 400km on a full tank of gas

Ex: Given fuel stops : 0(source) | 150 | 375 | 700 | 750(destination)
Expected Output: 1 (as only 1 refill at 375km fuel station is need)
*/

class carRefuel {

    /*
    Markers is an array which consists of all the fuel stop locations from start to stop.
    Stops is the number of fuel stations that are present from start to stop (Stops is the length of array markers)
    Range is the maximum distance that our vehicle can travel on a full tank
    */
    static int noOfRefills(int markers[],int stops, int range){
        int lastRefill=0,currentPos=0,numRefill=0;
        while(currentPos<=stops){
            lastRefill = currentPos;;
            while(currentPos<stops && (markers[currentPos+1]-markers[lastRefill]<=range)){
                currentPos++;
            }
            if(currentPos==stops) break; //If the current position is same as the final position
            if(currentPos==lastRefill){
                return -1; //Return this is the journey is not possible
            }
            if(currentPos<=stops){
                numRefill++;
            }
        }
        return numRefill;
    }
    public static void main(String[] args) {
        System.out.println("This is the program for car refueling!");
        int markers[] = {0,150,375,700,1000}; // ) is the source, 750 is the destination
        int range = 400;
        int stops = markers.length-1;

        int ans = noOfRefills(markers, stops,range);

        System.out.println("The number of refills needed is: "+ans);
    }
    
}
