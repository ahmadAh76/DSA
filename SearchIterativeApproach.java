public class SearchIterativeApproach {
public static void SearchI(Node head,int key){
while (head!=null){
    if (head.data==key)
        System.out.println("we have the element");


    head=head.Next;
}
}
}
