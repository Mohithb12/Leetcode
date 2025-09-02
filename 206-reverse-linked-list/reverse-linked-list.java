/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }
        int i = list.size() -1;
        System.out.println(list.toString());

        
        ListNode prev = new ListNode(list.get(i--));
        head = prev;
        
        while(i >= 0)
        {
            ListNode temp1 = new ListNode(list.get(i--));
            prev.next = temp1 ;
            prev = prev.next;
            
        }

        return head;

    }
}