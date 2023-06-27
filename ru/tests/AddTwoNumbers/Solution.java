package ru.job4j.order.ru.tests.AddTwoNumbers;

import ru.job4j.order.ru.tests.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1)  {
            int sum = 0;
            if (l1 != null) {
                sum +=l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
        }

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        node1.val = 2;
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);

        node2.val = 5;
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);

        Solution solution = new Solution();

        System.out.println(solution.addTwoNumbers(node1, node2));
    }
}
