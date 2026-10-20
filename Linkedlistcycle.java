
public class Linkedlistcycle {

    // Node structure for the linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

   
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        
            if (slow == fast) {
                return true;
            }
        }

   
        return false;
    }

  
    public static void main(String[] args) {
        Linkedlistcycle solution = new Linkedlistcycle();

       
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(20);

       
        first.next = second;
        second.next = third;
        third.next = fourth;

      
        System.out.println(
            "Without cycle: " + solution.hasCycle(first)
        );

       
        fourth.next = second;

       
        System.out.println(
            "With cycle: " + solution.hasCycle(first)
        );
    }
}
