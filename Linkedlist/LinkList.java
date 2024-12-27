package Linkedlist;

public class LinkList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void printlink(LinkList list){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       LinkList ll=new LinkList();
       ll.addfirst(1);
       ll.addfirst(2);
       ll.addLast(3);
       ll.addLast(4);
       printlink(ll);
    }
}
