/**
 * User: xijing2000
 * Date: 11/23/13
 * Time: 8:58 19PM
 */


import java.util.HashMap;

/**
 * Given a circular linked list, implement an algorithm which returns node at the beginning of the loop.
 * Input: A –> B –> C –> D –> E –> C [the same C as earlier]
 * Output: C
 */
public class FindCycle {

    public static Node initial() {
        Node node = new Node('A');
        node.appendToTail('B');
        node.appendToTail('C');
        node.appendToTail('D');
        node.appendToTail('E');
        node.appendToTail('F');
        node.appendToTail('G');
        node.appendToTail('H');
        node.appendToTail('I');
        node.appendToTail('J');
        node.appendToTail('K');

        Node head = node;
        Node start;

        while (!node.next.data.equals('C')) {
            node = node.next;
        }
        start =  node.next;

        while (node.next != null){
            node = node.next;
        }
        node.next = start;

        return head;
    }

    public static Node findCycleStart(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;
        slow = slow.next;
        fast = fast.next.next;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }

    public static Node findCycleStartHash(Node head) {
        HashMap<Node, Object> table = new HashMap<Node, Object>();
        while (!table.containsKey(head)) {
            table.put(head, head.data);
            head = head.next;
        }
        return head;
    }

    public static void main(String args[]) {
        Node head = initial();
        //System.out.println(findCycleStart(head).data);
        System.out.println(findCycleStartHash(head).data);
    }
}
