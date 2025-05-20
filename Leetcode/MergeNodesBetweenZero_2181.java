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
    public ListNode mergeNodes(ListNode head) {
        ListNode headResult = new ListNode();
        ListNode currentResult = headResult;
        ListNode temp = head.next;
        int sum = 0;
        while(temp != null){
            if(temp.val == 0){
                ListNode newNode = new ListNode(sum);
                currentResult.next = newNode;
                currentResult = currentResult.next;
                sum = 0;
            }
            else{
                sum = sum + temp.val;
            }
            temp = temp.next;
        }
        return headResult.next;
    }
}