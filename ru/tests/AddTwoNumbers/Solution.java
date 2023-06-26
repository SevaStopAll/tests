package AddTwoNumbers;

import ru.job4j.order.ru.tests.ListNode;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        StringBuilder builder = new StringBuilder();
        while (l1 != null) {
            builder.append(l1.val);
            l1 = l1.next;
        }
        StringBuilder builder2 = new StringBuilder();
        while (l2 != null) {
            builder2.append(l2.val);
            l2 = l2.next;
        }

        /// Переполнение типа Long. Надо сделать в массиве, видимо. Или в мапе.
        Map<Integer, Integer> firstNumber = new HashMap<>();
        Map<Integer, Integer> secondNumber = new HashMap<>();

        String targetNumber = String.valueOf(Long.parseLong(builder.reverse().toString()) + Long.parseLong(builder2.reverse().toString()));
        char[] ch = targetNumber.toCharArray();
        ListNode first = new ListNode(Character.digit(ch[ch.length - 1], 10));
        ListNode second = first;
        for (int i = ch.length - 2; i >= 0; i--) {
            second.next = new ListNode(Character.digit(ch[i], 10));
            second = second.next;
        }
        return first;
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
