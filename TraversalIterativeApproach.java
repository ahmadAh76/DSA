public class TraversalIterativeApproach {
    public static void traverseList(Node head){
        while (head!=null){
            System.out.println(head.data);
            head=head.Next;

        }
    }
}
