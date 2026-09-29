class Solution {
    public ListNode middleNode(ListNode head) {
        int length =0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            length++;
        }
        int middle = length / 2;
        temp = head;
        while (middle > 0) {
            temp = temp.next;
            middle --;
        }
        return temp;
    }
}