Problem No:141
Problem:Linked List Cycle
Solution:
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}

Problem No:83
Problem:Remove Duplicates from Sorted List
Solution:
class Solution
  {
    public ListNode deleteDuplicates(ListNode head) 
  {
        ListNode current = head;
        while (current != null && current.next != null) 
        {
            if (current.val == current.next.val) 
            {
                current.next = current.next.next;
            } 
            else 
            {
                current = current.next;
            }
        }
        return head;
    }
}
