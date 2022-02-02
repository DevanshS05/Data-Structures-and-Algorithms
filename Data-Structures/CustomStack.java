public class CustomStack{
    private int arr[];
    private int size;
    private int top=-1;
  
    CustomStack(){
      //If size is not given, then assume default size to be 10
      this.arr = new int[10];
      this.size=10;
    }
  
    CustomStack(int size){
      this.arr = new int[size];
      this.size = size;
    }
  
    void push(int val){
      //For when the array becomes full
      if(top==(size-1)){
        //If the array become full, create a new array double the size of the 
        //previous array and then point the array to the new array
        int newArr[] = new int[size*2];
        for(int i=0;i<size;i++){
          newArr[i]=arr[i];
        }
        size*=2; //Double the size
        arr = newArr;
      }
  
        arr[++top] = val;
    }
  
    int pop(){
      if(top==-1){
        return -1;
      }
      else{
        return arr[top--];
      }
    }
  
    int peek(){
      if(top==-1){return -1;}
      else{ return arr[top];}
    }
  
    void print(){
      if(top==-1){System.out.println("Stack is empty!");return;}
      System.out.println("Stack");
      for(int i=0;i<=top;i++){
        System.out.print(arr[i] + " | " );
      }
      System.out.println();
    }
  }