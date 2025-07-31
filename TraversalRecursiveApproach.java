public class TraversalRecursiveApproach {
    public static void traverseListr(Node head){
        if (head==null){
            System.out.println(head.data);
        }

        System.out.println(head.data);
        traverseListr(head.Next);
    }
}
