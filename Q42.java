class Node2{
    int val;
    Node2 next;

    Node2(int v){
        val = v;
        next = null;
    }
}

public class Q42 {

    static Node2 merge(Node2 l1, Node2 l2){

        Node2 dummy = new Node2(0);
        Node2 curr = dummy;

        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if(l1 != null) curr.next = l1;
        if(l2 != null) curr.next = l2;

        return dummy.next;
    }

    public static void main(String[] args) {

        Node2 l1 = new Node2(1);
        l1.next = new Node2(2);
        l1.next.next = new Node2(4);

        Node2 l2 = new Node2(1);
        l2.next = new Node2(3);
        l2.next.next = new Node2(4);

        Node2 result = merge(l1,l2);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}