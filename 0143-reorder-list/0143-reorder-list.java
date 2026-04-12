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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        java.util.ArrayList<ListNode> list = new java.util.ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            ListNode first = list.get(i);
            ListNode last = list.get(j);

            first.next = last;
            i++;

            if (i == j) break;

            last.next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}