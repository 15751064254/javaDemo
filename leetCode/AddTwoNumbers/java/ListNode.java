public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    static ListNode buildListNode(int[] arrays) {
        ListNode first = null, last = null, newNode;
        for (int i = 0; i < arrays.length; i++) {
            newNode = new ListNode(arrays[i]);
            newNode.next = null;
            if (first == null) {
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        }

        return first;
    }
}
