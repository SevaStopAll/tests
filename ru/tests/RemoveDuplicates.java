package ru.job4j.order.ru.tests;


import java.util.*;

public class RemoveDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while(list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }
        return head;
    }




    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(3);
        ListNode head5 = new ListNode(3);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        RemoveDuplicates dupl = new RemoveDuplicates();
        dupl.deleteDuplicates(head);
    }


}