public class main {

    public static void main(String args[]){
        CustomQueue q = new CustomQueue(2);

    for(int i=1;i<=50;i++){
        q.queue(i);
    }
    
    q.print();

    /*
    for(int i=0;i<15;i++){
        System.out.println("Queue dequed: "+q.deque());
    }
    */
}
    }

    
