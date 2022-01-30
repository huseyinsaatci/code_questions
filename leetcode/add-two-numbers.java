//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    ListNode sum = new ListNode();
    ListNode head = sum;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        sum(l1, l2, 0);
        return head.next;
    }

    public void sum(ListNode l1, ListNode l2, int remainder) {
        if (l1 == null && l2 == null) {
            if (remainder > 0) {
                add(remainder);
            }
            return;
        }
        if (l1 == null)
            l1 = new ListNode(0);
        if (l2 == null)
            l2 = new ListNode(0);
        int digitSum = (l1.val + l2.val + remainder) % 10;
        add(digitSum);
        int newRemainder = (l1.val + l2.val + remainder) / 10;
        sum(l1.next, l2.next, newRemainder);
    }

    public void add(int digitSum) {
        if (sum.next == null) {
            sum.next = new ListNode(digitSum);
        } else {
            sum.next.val = digitSum;
        }
        sum = sum.next;
    }
}//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    ListNode sum = new ListNode();
    ListNode head = sum;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        sum(l1, l2, 0);
        return head.next;
    }

    public void sum(ListNode l1, ListNode l2, int remainder) {
        if (l1 == null && l2 == null) {
            if (remainder > 0) {
                add(remainder);
            }
            return;
        }
        if (l1 == null)
            l1 = new ListNode(0);
        if (l2 == null)
            l2 = new ListNode(0);
        int digitSum = (l1.val + l2.val + remainder) % 10;
        add(digitSum);
        int newRemainder = (l1.val + l2.val + remainder) / 10;
        sum(l1.next, l2.next, newRemainder);
    }

    public void add(int digitSum) {
        if (sum.next == null) {
            sum.next = new ListNode(digitSum);
        } else {
            sum.next.val = digitSum;
        }
        sum = sum.next;
    }
}
