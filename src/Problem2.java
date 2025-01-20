public class Problem2 {

    public static void main(String[] args) {
        ListNode test1l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode test1l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));

        System.out.println("test 1 first Node: " + addTwoNumbers(test1l1, test1l2).val);
        System.out.println("test 1 second Node: " + addTwoNumbers(test1l1, test1l2).next.val);
        System.out.println("test 1 third Node: " + addTwoNumbers(test1l1, test1l2).next.next.val);
        System.out.println("test 1 fourth Node: " + addTwoNumbers(test1l1, test1l2).next.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int temp;
        int carry = 0;
        while (l1 != null && l2 != null) {
            temp = l1.val + l2.val;
            if ((temp + carry) >= 10) {
                temp = (temp + carry) % 10;
                carry = 1;
            } else {
                temp = temp + carry;
                carry = 0;
            }
            current.next = new ListNode(temp);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null || carry != 0 && l2 == null) {
            if (l1 == null) {
                current.next = new ListNode(carry);
                carry = 0;
            } else if (l1.val + carry >= 10) {
                current.next = new ListNode((l1.val + carry) % 10);
                carry = 1;
                l1 = l1.next;
            } else {
                current.next = new ListNode(l1.val + carry);
                carry = 0;
                l1 = l1.next;
            }
            current = current.next;

        }
        while (l2 != null || carry != 0) {
            if (l2 == null) {
                current.next = new ListNode(carry);
                carry = 0;
            } else if (l2.val + carry >= 10) {
                current.next = new ListNode((l2.val + carry) % 10);
                carry = 1;
                l2 = l2.next;
            } else {
                current.next = new ListNode(l2.val + carry);
                carry = 0;
                l2 = l2.next;
            }
            current = current.next;

        }

        return head.next;
    }

    static class ListNode {
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

}
