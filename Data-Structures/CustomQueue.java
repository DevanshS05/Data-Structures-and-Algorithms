public class CustomQueue{
    int arr[];
    int size;
  
    //int first;
    int last = -1;
  
    CustomQueue(){
      //Default Size : 10
      arr = new int[10];
      size=10;
    }
  
    CustomQueue(int size){
      arr = new int[size];
      this.size=size;
    }
  
    void queue(int val){
      if(last==(size-1)){
        //If the queue is full, then create an array twice the size and then copy the 
        //elements of the old array into the new array
        int newArr[] = new int[size*2];
        for(int i=0;i<size;i++){
          newArr[i]=arr[i];
        }
        size = size*2;
        arr = newArr;
      }

        //Add the element to the array
        arr[++last]=val;
    }

    int deque(){
      if(last==-1){
        return -1; //Queue is already empty
      }
      if(last==0){
        return arr[last--]; //If only one element is present in the Queue
      }
      else{
        int removedElement = arr[0];
        int newArr[] = new int[size];
        for(int i=1;i<=last;i++){
          newArr[i-1] = arr[i];
        }
        last--;
        arr = newArr;
        return removedElement;

      }

    }
  
    void print(){
      for(int i=0;i<=last;i++){
        System.out.print(arr[i]+" | ");
      }
    }
  }