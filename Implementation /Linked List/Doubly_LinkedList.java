class Node {
    int data;
    Node next;
    Node prev;
    Node(int x){
        data=x;
        next=null;
        prev=null;
    }
}
class Doubly_LinkedList{
     public static void printnode(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
         System.out.println();
    }
    public static Node front(Node head , int x){
        Node newelement= new Node(x);
        newelement.next=head;
        head.prev=newelement;
        return newelement;
    }
    public static Node last(Node head , int x){
        if(head==null) return new Node (x);
        Node newelement=new Node(x);
        Node ret=head;
        while(head.next!=null){
            head=head.next;
        }
        head.next=newelement;
        newelement.prev=head;
        return ret;
    }
    public static Node reverse(Node head){
        Node ret=head;
        while(head.next!=null){
            Node temp = head.next;
            head.next=head.prev;
            head.prev=temp;
            head=temp;
        }
        return ret;
    }
    public static void main(String [] args){
       Node head= new Node(1);
       head.next=new Node(2);
       head.next.prev=head;
       head.next.next=new Node(3);
       head.next.next.prev=head.next;
       printnode(head);
       head=front(head, 0 );
       printnode(head);
       head=last(head, 4);
       printnode(head);
       head=reverse(head);
       printnode(head);
    }
}