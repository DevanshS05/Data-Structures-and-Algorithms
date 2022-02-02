public class LL{
    Node head;
    Node tail;
    int size;
  
    LL(){
      this.size=0;
      this.head=null;
      this.tail=null;
    }
  
    void insertAtHead(int val){
      Node tmp = new Node(val);
      tmp.next = head;
      head = tmp;
      size++;
    }
  
    void insertAtTail(int val){
      Node tmp = new Node(val);
      Node ptr = head;
      while(ptr.next!=null){
        ptr=ptr.next;
      }
      tmp.next = ptr.next;
      ptr.next=tmp;
    }
  
    void print(){
      Node tmp = head;
      while(tmp!=null){
        System.out.print(tmp.val+" --> ");
        tmp=tmp.next;
      }
    }
  
    void print(Node head){
      Node tmp = this.head;
      while(tmp!=null){
        System.out.print(tmp.val+" --> ");
        tmp=tmp.next;
      }
    }
  
     void insertAtHead(Node head,int val){
      Node tmp = new Node(val);
      tmp.next = this.head;
      this.head = tmp;
    }
  
  
    class Node{
      int val;
      Node next;
  
      Node(){
        this.next=null;
      }
  
      Node(int val){
        this.val = val;
      }
  
      Node(int val,Node next){
        this.val = val;
        this.next = next;
      }
    }
  }