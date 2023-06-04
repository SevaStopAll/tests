package ru.job4j.order.source;


public class RemoveDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode currentNode = head.next;
        while (currentNode != null) {
            ListNode node = currentNode.next;
            if (head.val == currentNode.val) {
                head.next = null;
            }
            head = currentNode;
            currentNode = node;
        }
        return head;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(3);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        RemoveDuplicates dupl = new RemoveDuplicates();
        System.out.println(dupl.deleteDuplicates(head));
    }


}