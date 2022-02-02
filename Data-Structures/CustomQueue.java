public class CustomQueue{
    int arr[];
    int size;
  
    int first;
    int last;
  
    CustomQueue(){
      //Default Size : 10
      arr = new int[10];
      size=10;
    }
  
    CustomQueue(int size){
      arr = new int[size];
      this.size=10;
    }
  
    void queue(int val){
      if(last==(size-1)){
        System.out.println("Queue is full!");
        return;
      }
      else{
        arr[++last]=val;
      }
    }
  
    void print(){
      for(int i=0;i<=last;i++){
        System.out.print(arr[i]+" | ");
      }
    }
  }