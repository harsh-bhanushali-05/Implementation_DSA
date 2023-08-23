class Node {
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Linked_list{
      public static void printnode(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
         System.out.println();
    }
    public static Node insert_front(Node head , int x ){
        Node newHead=new Node(x);
        newHead.next=head;
        return newHead;
    }
    public static Node insert_last(Node head, int x ){
        Node ret=head;
        Node newNode=new Node (x);
        if(head==null)return newNode;
        while(head.next!=null){
            head=head.next;
        }
        head.next=newNode;
        return ret;
    }
    public static Node insert_pos(Node head, int x , int pos){
        Node newNode=new Node (x);
        int i =0;
        if(pos==0)
        {
            return insert_front(head, x );
        }
        Node ret= head ; 
        while(head!=null){
            head=head.next;
            i++;
            if(i==pos){
                newNode.next=head.next;
                head.next=newNode;
                return ret;
            }
        }
        return ret;
    }
    public static Node delete_first(Node head){
        if(head==null)return null;
        return head.next;
    }
    public static Node delete_Last(Node head){
        if(head==null || head.next==null)return null;
        Node temp = head;
        while(head.next.next!=null){
            head=head.next;
        }
        head.next=null;
        return temp; 
    }
    public static void main(String [] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        printnode(head);
        head=insert_front(head,0);
        printnode(head);
        head=insert_last(head,4);
        printnode(head);
        head=insert_pos(head,2,4);
        printnode(head);
        head=delete_Last(head);
        printnode(head);

    }
}