class Node1{
    int data;
    Node1 next;

    Node1(int d){
        data = d;
        next = null;
    }
}

public class Q41 {

    static Node1 middle(Node1 head){

        Node1 slow = head;
        Node1 fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);

        Node1 mid = middle(head);

        while(mid != null){
            System.out.print(mid.data + " ");
            mid = mid.next;
        }
    }
}