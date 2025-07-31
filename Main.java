public class Main {
    public static void main(String[] args) {
 //here we make a singly lin;ed list
Node head=new Node(10);
Node n1=new Node(20);
Node n2=new Node(30);
Node n3=new Node(40);
Node n4=new Node(50);
Node n5=new Node(60);
//here we conect
head.Next=n1;
n1.Next=n2;
n2.Next=n3;
n3.Next=n4;
n4.Next=n5;




//here we print linked list
//TraversalIterativeApproach.traverseList(head);
TraversalRecursiveApproach.traverseListr(head);
    }
}